package com.dio.project.service;

import com.dio.project.facade.BancoFacade;
import org.springframework.stereotype.Service;

@Service
public class BancoService {
    private final BancoFacade bancoFacade = new BancoFacade();

    public void realizarOperacao(String tipo, double valor) {
        bancoFacade.realizarOperacao(tipo, valor);
    }
}

