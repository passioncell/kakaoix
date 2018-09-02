package com.passioncell.kakaoixshop.controller;

import com.passioncell.kakaoixshop.domain.AjaxResponseBody;
import com.passioncell.kakaoixshop.domain.CartDomain;
import com.passioncell.kakaoixshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    ProductService productService;

    /*
        장바구니 (POST)
     */
    @PostMapping(value="/cart")
    public ResponseEntity<?> saveCart(@RequestBody CartDomain cart){
        AjaxResponseBody result = new AjaxResponseBody();
        List<String> resultList = new ArrayList<String>();
        try{
            productService.saveCart(cart);
            result.setMsg("장바구니에 상품이 추가되었습니다!");
            resultList.add("success");
        }
        catch(Exception e){
            result.setMsg(e.getMessage());
            resultList.add("error");
        }
        result.setResult(resultList);
        return ResponseEntity.ok(result);
    }

    /*
        장바구니 (DELETE)
     */
    @DeleteMapping(value="/cart/{id}")
    public String deleteCart(@PathVariable String id){
        String resultMsg;
        try{
            productService.deleteCart(Integer.parseInt(id));
            resultMsg="해당 상품을 장바구니에서 제거하였습니다.";
        }
        catch(Exception e){
            resultMsg=e.getMessage();
        }

        return resultMsg;
    }
}
