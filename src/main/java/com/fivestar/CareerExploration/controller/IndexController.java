package com.fivestar.CareerExploration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController
{
    @GetMapping("/homepage")
    public String homepg()
    {
        return "index";
    }

}
