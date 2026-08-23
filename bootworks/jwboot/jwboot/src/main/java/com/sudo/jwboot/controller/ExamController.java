package com.sudo.jwboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ExamController {

    @GetMapping("/ex01")
    public String method1(Model model){
        model.addAttribute("data1", "Model 예제");
        return "pages/viewPage01";
    }

    @GetMapping("/ex02")
    public String method2(@RequestParam("id") String userId,
                          @RequestParam("pw") String userPw,
                          Model model){
        model.addAttribute("data1", "@RequestParam 예제");
        model.addAttribute("data2", "id:" + userId + "<br>pw:" + userPw );
        return "pages/viewPage02";
    }
}
