package com.ashen.spring_boot_mvc;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ashen.spring_boot_mvc.model.Alien;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return ("index");
    }

    @RequestMapping("add")
    public ModelAndView add(@RequestParam("num1") int i, @RequestParam("num2") int j) {

        int num3 = i + j;

        ModelAndView mv = new ModelAndView();
        mv.setViewName("result");
        mv.addObject("num3", num3);

        return mv;
    }

    @PostMapping("addAlien")
    public String addAlien(@ModelAttribute Alien a, Model m) {

        m.addAttribute("alien", a);

        return "result";
    }

    @GetMapping("/getALien")
    public String getAlien(Model m) {

        List<Alien> aliens = Arrays.asList(new Alien(200, "isuru"), new Alien(201, "malidu"));
        m.addAttribute("result", aliens);
        return "showAlien";
    }

}
