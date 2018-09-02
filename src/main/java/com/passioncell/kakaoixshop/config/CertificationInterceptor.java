package com.passioncell.kakaoixshop.config;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/*
    컨트롤러에 접근하기 전 사용자의 세션 정보를 확인하여
    로그인 하지 않은 사용자는 회원가입/로그인/에러 페이지를 제외하고는 못들어가도록 가로챈다.
 */
@Component
public class CertificationInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        HttpSession session = request.getSession();
        String customerId  = (String) session.getAttribute("customerId");
        if(customerId==null){
            try {
                response.sendRedirect("/member/signin");
                return false;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return true;
    }

}
