package com.dio.project.facade;

import com.dio.project.strategy.Deposito;
import com.dio.project.strategy.OperacaoBancaria;
import com.dio.project.strategy.Saque;

public class BancoFacade {
    public void realizarOperacao(String tipo, double valor) {
        OperacaoBancaria operacao;
        if ("deposito".equalsIgnoreCase(tipo)) {
            operacao = new Deposito();
        } else if ("saque".equalsIgnoreCase(tipo)) {
            operacao = new Saque();
        } else {
            System.out.println("Operação inválida");
            return;
        }
        operacao.executar(valor);
    }
}

