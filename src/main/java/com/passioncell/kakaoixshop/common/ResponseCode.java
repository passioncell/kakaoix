package com.passioncell.kakaoixshop.common;

/*
    여러 상황에 대한 응답 상수 클래스
 */

public class ResponseCode {
    /*
        로그인 관련
     */
    public static final int SIGNIN_RES_CODE_VALID = 100;
    public static final int SIGNIN_RES_CODE_INVALID_NOT_EXISTS_ID = 101;
    public static final int SIGNIN_RES_CODE_INVALID_NOT_MATCH_ID_PW = 102;



    /*
        회원가입 관련
     */
    public static final int SIGNUP_RES_CODE_VALID = 103;
    public static final int SIGNUP_RES_CODE_OVERLAP = 104;
}
