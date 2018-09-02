package com.passioncell.kakaoixshop.service;

import com.passioncell.kakaoixshop.domain.CartDomain;
import com.passioncell.kakaoixshop.domain.CartListDomain;
import com.passioncell.kakaoixshop.domain.OrderHistoryDomain;
import com.passioncell.kakaoixshop.domain.ProductDomain;

import java.util.List;

public interface ProductService {
    // 상품데이터 가져오기
    public List<ProductDomain> getProducts(int pageNumber);
    // 특정 하나의 상품 가져오기
    public ProductDomain getProductOne(int productId);
    // (ajax - api) 장바구니에 상품 추가하기
    public void saveCart(CartDomain cartDomain);
    // 장바구니 목록 가져오기
    public List<CartListDomain> getCarts(int memberId);
    // 장바구니 삭제
    public void deleteCart(int cartId);
    // 주문처리
    public void execOrder(int memberId);
    // 거래완료 내역 가져오기
    public List<OrderHistoryDomain> getOrderHistory(int memberId);
}
