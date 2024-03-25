package com.study.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    /*
    페이지 이동에 우선순위가 있음
    먼저 컨트롤러에서 / (기본 페이지)를 호출하는게 있는지 확인하고
    static/index.html를 호출함
     */
    @GetMapping("/")
    public String home() {
        return "home";
    }


}
