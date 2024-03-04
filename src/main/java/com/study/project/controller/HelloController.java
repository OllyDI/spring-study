package com.study.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    // GetMapping은 주소값 ex) localhost:8080/hello
    // return은 html이름 ex) hello.html
    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "hello");
        return "hello";
    }

    /*
    MVC 방식
    localhost:8080/hello-mvc?name="파라미터값" 이런식으로 파라미터 전달가능
     */
    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        return "hello-template";
    }

    /*
    API
    @ResponseBody: html Body 부분에 데이터를 직접 삽입
    기존 위에 존재하는 mvc와의 차이는 view가 필요 없이 이 문자 그대로 삽입

    이런 방식은 사용하지 않음
     */
    @GetMapping("hello-string")
    @ResponseBody
    public String helloString(@RequestParam("name") String name) {
        return "hello " + name;
    }


    // API 사용 이유 -> json 데이터 전송 (Default가 json데이터 반환)
    // 객체를 전달할 때 json 데이터를 전송함
    @GetMapping("hello-api")
    @ResponseBody
    public Hello HelloApi(@RequestParam("name") String name) {
        Hello hello = new Hello();
        hello.setName(name);
        return hello;
    }


    static class Hello {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
