package com.ashen.spring_boot_mvc;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashen.spring_boot_mvc.model.Alien;

public interface AlienRepo extends JpaRepository<Alien,Integer>{
    
}
