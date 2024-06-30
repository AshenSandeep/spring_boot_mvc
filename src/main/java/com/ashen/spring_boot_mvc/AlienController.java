package com.ashen.spring_boot_mvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ashen.spring_boot_mvc.model.Alien;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class AlienController {
    @Autowired
    AlienRepo repo;

    @GetMapping("aliens")
    @ResponseBody
    public String getAliens() {
        List<Alien> aliens = repo.findAll();

        return aliens.toString();
    }

    @GetMapping("alien/{id}")
    @ResponseBody
    public Alien getAlien(@PathVariable("id") int id) {

        Alien alien = repo.findById(id).orElse(new Alien(1000, ""));
        return alien;
    }

    @PostMapping("alien")
    public Alien addAlien(Alien alien) {
        repo.save(alien);

        return alien;
    }

}
