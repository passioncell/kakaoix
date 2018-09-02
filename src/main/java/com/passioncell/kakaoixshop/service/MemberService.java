package com.passioncell.kakaoixshop.service;

import com.passioncell.kakaoixshop.domain.MemberDomain;
import com.passioncell.kakaoixshop.domain.SigninDomain;

import javax.servlet.http.HttpSession;

public interface MemberService {
    // 회원 기본키 가져오기
    public int getMemberPkByCustomerId(String customerId);

    // 로그인 유효성 검사
    public int checkLoginIsValid(SigninDomain signinDomain);

    // 로그인 세션 저장
    public void saveSession(SigninDomain signinDomain, HttpSession session);

    // 로그아웃
    public void signout(HttpSession session);

    // 아이디 중복 검사
    public boolean countOverlapId(String customerId);

    // 회원가입
    public int insertMember(MemberDomain member);

    // 비밀번호 암호화
    public String toBCrypt(String password);

}
