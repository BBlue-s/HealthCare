package com.example.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
 @GetMapping("/signup")
    public ModelAndView showRegisterForm(){return new ModelAndView("signup");
 }
}
