package com.ll.basic1.boundedContext.member.controller;

import com.ll.basic1.base.rsData.RsData;
import com.ll.basic1.boundedContext.member.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.LinkedHashMap;
import java.util.Map;

@Controller
public class MemberController {
    private final MemberService memberService;

    public MemberController() {
        memberService = new MemberService();
    }
    @GetMapping("/member/login")
    @ResponseBody
    public RsData login(String username, String password) {
        if ( username == null || username.trim().length() == 0 ) {
            return RsData.of("F-3", "username(을)를 입력해주세요.");
        }

        if ( password == null || password.trim().length() == 0 ) {
            return RsData.of("F-4", "password(을)를 입력해주세요.");
        }

        return memberService.tryLogin(username, password);
    }
}
