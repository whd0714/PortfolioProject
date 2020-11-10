package com.portfolio.controller.main;

import com.portfolio.controller.member.CurrentUser;
import com.portfolio.domain.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(@CurrentUser Member member, Model model){
        if(member != null){
            System.out.println("memberId3 = " + member.getMemberId());
            System.out.println("verifyToken3 = " + member.isVerifyEmail());
            model.addAttribute(member);
        }


        return "/index";
    }

    @GetMapping("/login")
    public String login(){
        return "/login";
    }

}