package com.passioncell.kakaoixshop.mapper;

import com.passioncell.kakaoixshop.domain.MemberDomain;
import com.passioncell.kakaoixshop.domain.SigninDomain;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {
    /*
        로그인 아이디를 통하여 회원 PK 가져오기
     */
    public int getMemberPkByCustomerId(String customerId);

    /*
        [로그인] 일치하는 아이디 확인
     */
    public int countValidId(SigninDomain signinDomain);

    /*
        [로그인] 암호화된 비밀번호 가져오기
     */
    public String getHashPassword(String customerId);

    /*
        [회원가입] 아이디 중복 검사
     */
    public int countOverlapId(String customerId);

    /*
        [회원가입] 신규 유저 정보 저장
     */
    public void insertMember(MemberDomain member);


    public MemberDomain selectMemberByLoginId(String customerId);
}
