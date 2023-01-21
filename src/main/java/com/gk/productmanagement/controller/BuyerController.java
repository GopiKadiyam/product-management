package com.gk.productmanagement.controller;

import com.gk.productmanagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BuyerController {

        @Autowired
        private UserRepository userRepository;

    @GetMapping("/test")
    public String test(){
        return userRepository.findById(1L).get().getGmail();
    }
}
