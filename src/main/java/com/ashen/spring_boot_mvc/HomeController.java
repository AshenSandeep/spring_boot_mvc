package com.ashen.spring_boot_mvc;

import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    AlienRepo repo;

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
    public String addAlien(@ModelAttribute Alien a) {

        repo.save(a);
        return "result";
    }

    @GetMapping("getAlien")
    public String getAlien(@RequestParam int id, Model m) {

        m.addAttribute("result", repo.findById(id));
        return "showAlien";
    }

    @GetMapping("getAlienByName")
    public String getAlienByName(@RequestParam String name, Model m) {

        m.addAttribute("result", repo.findByName(name));
        return "showAlien";
    }

    @GetMapping("getAlienNameByOrder")
    public String getAlienNameByOrder(@RequestParam String name, Model m) {

        m.addAttribute("result", repo.findByNameOrderByName(name));
        return "showAlien";
    }
}
