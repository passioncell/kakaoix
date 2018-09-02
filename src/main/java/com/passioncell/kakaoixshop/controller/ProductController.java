package com.passioncell.kakaoixshop.controller;

import com.passioncell.kakaoixshop.domain.OrderHistoryDomain;
import com.passioncell.kakaoixshop.domain.ProductDomain;
import com.passioncell.kakaoixshop.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpSession;
import java.util.List;


@Controller
@RequestMapping("/product")
public class ProductController {

    private static Logger logger = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    ProductService productService;

    /*
        상품목록 (GET)
     */
    @GetMapping("/page/{no}")
    public ModelAndView viewProduct(@PathVariable("no") int no){
        logger.info("GET /product/page/"+no);
        ModelAndView nextPage = new ModelAndView("product.list");
        List<ProductDomain> products = productService.getProducts(no);
        nextPage.addObject("products", products);
        return nextPage;
    }

    /*
        상품 디테일 (GET)
     */
    @GetMapping("/{id}")
    public ModelAndView viewProductDetail(@PathVariable("id") int id, HttpSession session){
        logger.info("GET /product/"+id);
        ModelAndView nextPage = new ModelAndView("product.detail");
        ProductDomain product = productService.getProductOne(id);
        nextPage.addObject("product", product);
        nextPage.addObject("fkMemberId", session.getAttribute("id"));
        return nextPage;
    }

    /*
        장바구니 (GET)
     */
    @GetMapping("/cart")
    public ModelAndView viewCartList(HttpSession session) {
        logger.info("GET /product/cart");
        int memberId = (int) session.getAttribute("id");
        ModelAndView nextPage = new ModelAndView("product.cart");
        nextPage.addObject("carts", productService.getCarts(memberId));
        return nextPage;
    }

    /*
        결재하기 (POST)
     */
    @PostMapping("/order")
    public RedirectView execOrder(int memberId){
        logger.info("POST /product/order");
        productService.execOrder(memberId);
        return new RedirectView("/product/cart");
    }

    /*
        구매완료 내역(GET)
     */
    @GetMapping("/order/history")
    public ModelAndView viewOrderHistory(HttpSession session){
        logger.info("GET /product/order/history");
        int memberId = (int) session.getAttribute("id");
        List<OrderHistoryDomain> orderHistories = productService.getOrderHistory(memberId);
        ModelAndView nextPage = new ModelAndView("product.order.history");
        nextPage.addObject("histories", orderHistories);
        return nextPage;
    }


}
