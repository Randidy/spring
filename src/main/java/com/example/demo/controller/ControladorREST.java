package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@Controller
@RequestMapping("/api")
public class ControladorREST {

    @GetMapping("/inicio")
    public String inicio(){

        return "indice";
    }

        @GetMapping("/mensaje")
        public Map<String, String> obtenerMensaje() {
            Map<String, String> respuesta = new HashMap<>();
            respuesta.put("mensaje", "Hola, este es un JSON simple");
            return respuesta;
        }





}



