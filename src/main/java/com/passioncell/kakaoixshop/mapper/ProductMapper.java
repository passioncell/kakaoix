package com.passioncell.kakaoixshop.mapper;

import com.passioncell.kakaoixshop.domain.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {
    // 특정 상품의 종속된 이미지 가져오기
    public List<String> getProductImagesById(int productId);
    // 상품의 썸네일 이미지 가져오기
    public String getProductThumnail(int productId);
    // 모든 상품 가져오기
    public List<ProductDomain> getProducts(int pageNumber);
    // 특정 한 상품 가져오기
    public ProductDomain getProductOne(int productId);
    // 장바구니에 상품 저장
    public void saveCart(CartDomain cart);
    // 장바구니 목록 가져오기
    public List<CartListDomain> getCarts(int memberId);
    // 장바구니 삭제
    public void deleteCart(int cartId);
    // 장바구니 상품 거래완료 처리
    public void setCartEndOfTransaction(int memberId);
    // 결재한 상품 저장
    public void saveOrder(OrderDomain order);
    // 거래내역 가져오기
    public List<OrderHistoryDomain> getOrderHistory(int memberId);
}
