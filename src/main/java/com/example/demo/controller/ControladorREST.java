package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorREST {

    @GetMapping("/inicio")
    public String comienzo(){

        return "indice";
    }







}



