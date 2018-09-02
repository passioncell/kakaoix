package com.passioncell.kakaoixshop.service.impl;

import com.passioncell.kakaoixshop.domain.*;
import com.passioncell.kakaoixshop.mapper.ProductMapper;
import com.passioncell.kakaoixshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductMapper productMapper;

    /*
        상품목록 가져오기
     */
    @Override
    public List<ProductDomain> getProducts(int pageNumber) {
        List<ProductDomain> products =  productMapper.getProducts(pageNumber);
        // 상품과 상품이미지 매핑
        for(int i=0; i<products.size(); i++){
            int productId = products.get(i).getId();
            products.get(i).setImageUrl(getProductImages(productId));
        }
        return products;
    }

    /*
        특정 상품 정보 한개 가져오기
     */
    @Override
    public ProductDomain getProductOne(int productId) {
        ProductDomain product = productMapper.getProductOne(productId);
        product.setImageUrl(getProductImages(productId));
        return product;
    }

    /*
        장바구니에 상품 추가하기
     */
    @Override
    public void saveCart(CartDomain cartDomain) {
        productMapper.saveCart(cartDomain);
    }


    /*
        장바구니 목록 가져오기
     */
    @Override
    public List<CartListDomain> getCarts(int memberId) {
        List<CartListDomain> cartList = productMapper.getCarts(memberId);
        // 썸네일 이미지 매핑
        for(int i=0; i<cartList.size(); i++){
            int productId = cartList.get(i).getProductId();
            cartList.get(i).setThumnail(getProductThumnail(productId));
        }
        return cartList;
    }

    /*
        장바구니 삭제
     */
    @Override
    public void deleteCart(int cartId) {
        productMapper.deleteCart(cartId);
    }

    /*
        구매 처리 -  장바구니에 등록된 상품 거래완료 처리 후 결재완료 한 상품 저장
     */
    @Override
    public void execOrder(int memberId) {
        List<CartListDomain> cartList = getCarts(memberId);
        List<OrderDomain> orders = new ArrayList<OrderDomain>();

        // 카트와 연관된 주문정보 생성
        for(CartListDomain cart : cartList){
            OrderDomain order = new OrderDomain();
            order.setMemberId(memberId);
            order.setProductId(cart.getProductId());
            order.setEa(cart.getEa());
            order.setOrderAt(new Date());
            orders.add(order);
        }

        try{
            // 각 상품에 대한 주문 로그 저장
            for(OrderDomain order : orders){
                productMapper.saveOrder(order);
            }

            // 장바구니 내역 거래 완료로 변경
            setCartEndOfTransaction(memberId);
        }
        catch(Exception e){
            // 트랜잭션 롤백 처리
            System.out.print(e.getMessage());
        }
    }

    /*
        구매 내역 데이터 가져오기
     */
    @Override
    public List<OrderHistoryDomain> getOrderHistory(int memberId) {
        return productMapper.getOrderHistory(memberId);
    }

    // 특정 상품에 종속된 이미지 모두 가져오기
    public List<String> getProductImages(int productId) {
        return productMapper.getProductImagesById(productId);
    }


    //상품 썸네일 이미지 가져오기
    public String getProductThumnail(int productId) {
        return productMapper.getProductThumnail(productId);
    }


    //장바구니 상품 주문완료 처리
    public void setCartEndOfTransaction(int memberId) {
        productMapper.setCartEndOfTransaction(memberId);
    }


}
