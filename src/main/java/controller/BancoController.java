package com.dio.project.controller;

import com.dio.project.service.BancoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/banco")
public class BancoController {
    
    @Autowired
    private BancoService bancoService;

    @PostMapping("/operacao")
    public String realizarOperacao(@RequestParam String tipo, @RequestParam double valor) {
        bancoService.realizarOperacao(tipo, valor);
        return "Operação de " + tipo + " realizada com sucesso!";
    }
}

