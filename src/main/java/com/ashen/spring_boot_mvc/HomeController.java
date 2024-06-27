package com.ashen.spring_boot_mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return ("index");
    }

    @RequestMapping("/add")
    public ModelAndView add(@RequestParam("num1") int i, @RequestParam("num2") int j) {

        int num3 = i + j;

        ModelAndView mv = new ModelAndView();
        mv.setViewName("result");
        mv.addObject("num3", num3);

        return mv;
    }
}
