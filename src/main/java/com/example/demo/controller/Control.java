package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class Control {

    @GetMapping("/mensaje")
    public Map<String, String> obtenerMensaje() {
        Map<String, String> respuesta = new HashMap<>();
        respuesta.put("mensaje", "Hola, este es un PROFE DE MIERda hijo de perra con su delegado chupapenes que se deja bajar el pantalon por el profe");
        return respuesta;
    }

}
