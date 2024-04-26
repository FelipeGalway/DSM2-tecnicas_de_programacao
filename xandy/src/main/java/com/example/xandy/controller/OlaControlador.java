package com.example.xandy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OlaControlador {
    
    @GetMapping(value="/api")
    public String mostrar1(){
        return "Olá Mundo do Spring Boot no VsCode";
    }

    @GetMapping(value="/ola")
    public String mostrar2(){
        return "Olá";
    }

}
