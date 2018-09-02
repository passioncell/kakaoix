package com.passioncell.kakaoixshop.controller;

import com.passioncell.kakaoixshop.common.ResponseCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;


@Controller
public class HomeController {
    private static Logger logger = LoggerFactory.getLogger(HomeController.class);

    /*
        메인 페이지
     */
    @GetMapping("/")
    public ModelAndView viewMain(HttpSession session) throws Exception{
        logger.info("GET /");
        ModelAndView nextPage = new ModelAndView("home.main");
        nextPage.addObject("customerId", session.getAttribute("customerId"));
        return nextPage;
    }

    /*
        예외 상황에 ResponseCode를 기반으로 메세지 출력.
     */
    @GetMapping("/exceptionHandler/{responseCode}")
    public ModelAndView viewError(@PathVariable("responseCode") int responseCode) throws Exception{
        logger.info("GET /exceptionHandler : responseCode is " + responseCode);
        String exceptionMessage;
        switch (responseCode) {
            case ResponseCode.SIGNIN_RES_CODE_INVALID_NOT_EXISTS_ID:
                exceptionMessage = "존재하는 아이디가 없습니다.";
                break;
            case ResponseCode.SIGNIN_RES_CODE_INVALID_NOT_MATCH_ID_PW:
                exceptionMessage = "아이디와 비밀번호가 일치하지 않습니다.";
                break;
            case ResponseCode.SIGNUP_RES_CODE_OVERLAP:
                exceptionMessage = "중복된 아이디가 존재합니다.";
                break;
            default:
                exceptionMessage = "unknow exception.";
                break;
        }

        ModelAndView nextPage = new ModelAndView("home.exceptionPage");
        nextPage.addObject("errorMessage", exceptionMessage);
        return nextPage;
    }
}
