package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.Map;

public class ControllerArom {
    @GetMapping("/mensaje")
    public Map<String, String> obtenerMensaje() {
        Map<String, String> respuesta = new HashMap<>();
        respuesta.put("mensaje", "Hola, este es un PROFE DE MIERA");
        return respuesta;
    }

}
