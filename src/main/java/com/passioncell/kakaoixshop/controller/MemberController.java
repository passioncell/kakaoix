package com.passioncell.kakaoixshop.controller;

import com.passioncell.kakaoixshop.common.ResponseCode;
import com.passioncell.kakaoixshop.domain.MemberDomain;
import com.passioncell.kakaoixshop.domain.SigninDomain;
import com.passioncell.kakaoixshop.service.MemberService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/member")
public class MemberController {

    private static Logger logger = LoggerFactory.getLogger(MemberController.class);

    @Autowired
    MemberService memberService;

    /*
        로그인 (GET)
     */
    @GetMapping("/signin")
    public ModelAndView viewSignin() throws Exception{
        logger.info("GET /member/signin");
        return new ModelAndView("member.signin");
    }

    /*
        로그인 (POST)
     */
    @PostMapping("/signin")
    public RedirectView postSignin(SigninDomain signinDomain, HttpSession session) throws Exception{
        logger.info("POST /signin - data : " + signinDomain.toString());
        int resultCode = memberService.checkLoginIsValid(signinDomain);
        if(resultCode == ResponseCode.SIGNIN_RES_CODE_VALID){
            memberService.saveSession(signinDomain, session);
            return new RedirectView("/");
        }
        return new RedirectView("/exceptionHandler/"+resultCode);
    }

    /*
        로그아웃 처리
     */
    @RequestMapping("/signout")
    public RedirectView signout(HttpSession session){
        memberService.signout(session);
        return new RedirectView("signin");
    }

    /*
        회원가입 (GET)
     */
    @GetMapping("/signup")
    public ModelAndView viewSignup() throws Exception{
        logger.info("GET /member/signin");
        return new ModelAndView("member.signup");
    }

    /*
        회원가입 (POST)
     */
    @PostMapping("/signup")
    public RedirectView postSignup(MemberDomain member){
        logger.info("POST /signup - data : " + member.toString());
        int resultCode = memberService.insertMember(member);
        if(resultCode == ResponseCode.SIGNUP_RES_CODE_VALID){
            return new RedirectView("signin");
        }
        return new RedirectView("/exceptionHandler/"+resultCode);
    }



}
