package com.passioncell.kakaoixshop.service.impl;

import com.passioncell.kakaoixshop.common.ResponseCode;
import com.passioncell.kakaoixshop.mapper.MemberMapper;
import com.passioncell.kakaoixshop.domain.MemberDomain;
import com.passioncell.kakaoixshop.service.MemberService;
import com.passioncell.kakaoixshop.domain.SigninDomain;
import com.passioncell.kakaoixshop.utill.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;


@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    MemberMapper memberMapper;

    /*
        회원 기본키 가져오기 by 로그인 아이디
     */
    @Override
    public int getMemberPkByCustomerId(String customerId) {
        return memberMapper.getMemberPkByCustomerId(customerId);
    }

    /*
        로그인 : 유효성 검사
         - 입력한 아이디가 존재하는지 검사
         - 입력한 아이디의 비밀번호와 암호화하여 저장된 비밀번호가 일치하는지 검사
    */
    @Override
    public int checkLoginIsValid(SigninDomain signinDomain) {
        // 입력한 ID가 DB에 존재하는지 검증.
        if(memberMapper.countOverlapId(signinDomain.getCustomerId()) != 1){
            return ResponseCode.SIGNIN_RES_CODE_INVALID_NOT_EXISTS_ID;
        }
        // 암호화된 비밀번호와 입력한 비밀번호 검증. (성공)
        String hashedPassword = memberMapper.getHashPassword(signinDomain.getCustomerId());
        if(BCrypt.checkpw(signinDomain.getCustomerPw(), hashedPassword)){
            return ResponseCode.SIGNIN_RES_CODE_VALID;
        }

        return ResponseCode.SIGNIN_RES_CODE_INVALID_NOT_MATCH_ID_PW;
    }

    /*
        로그인 : 사용자 정보 세션 저장
        (유저 기본키),(유저 로그인 아이디)
     */
    @Override
    public void saveSession(SigninDomain signinDomain, HttpSession session) {
        // 유저의 기본키 및 로그인 아이디 세션에 저장
        session.setAttribute("id", getMemberPkByCustomerId(signinDomain.getCustomerId()));
        session.setAttribute("customerId", signinDomain.getCustomerId());
    }

    /*
        로그아웃 : 사용자 정보 세션 초기화
     */
    @Override
    public void signout(HttpSession session) {
        session.invalidate();
    }


    /*
        회원가입 : 아이디 중복 검사
         - 사용자가 입력한 아이디의 중복된 데이터가 있는지 확인.
     */
    @Override
    public boolean countOverlapId(String customerId) {
        int resultCount = memberMapper.countOverlapId(customerId);
        return resultCount != 0 ? true : false;
    }

    /*
        회원가입 : 가입 처리
         - 아이디 중복 검사 후 중복되지 않은 아이디면 신규회원 데이터 저장.
     */
    @Override
    public int insertMember(MemberDomain member) {
        if(countOverlapId(member.getCustomerId())){
            return ResponseCode.SIGNUP_RES_CODE_OVERLAP;
        }
        member.setCustomerPw(toBCrypt(member.getCustomerPw()));
        memberMapper.insertMember(member);
        return ResponseCode.SIGNUP_RES_CODE_VALID;
    }

    /*
        보안 : 비밀번호 암호화(BCrypt)
     */
    @Override
    public String toBCrypt(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt(12));
    }


}
