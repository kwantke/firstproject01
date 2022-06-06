package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {

    @RequestMapping("/hi")
    public String niceToMeeting(Model model){

       model.addAttribute("username","광규2");
        return "greetings";
    }

    @GetMapping("/bye")
    public String seeYouNextTime(Model model){

        model.addAttribute("nickname","홍길동");
        return "goodbye";
    }
}


