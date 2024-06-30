package com.ashen.spring_boot_mvc;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ashen.spring_boot_mvc.model.Alien;

public interface AlienRepo extends JpaRepository<Alien, Integer> {
    List<Alien> findByName(String name); // query DSL
    // customized methods should naming rules below
    // 1. 'findBy' + variable name
    // 2. varibale name first letter should be capital letter
}
