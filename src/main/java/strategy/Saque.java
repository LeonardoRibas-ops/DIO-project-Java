package com.dio.project.strategy;

import com.dio.project.singleton.BancoSingleton;

public class Saque implements OperacaoBancaria {
    @Override
    public void executar(double valor) {
        BancoSingleton banco = BancoSingleton.getInstance();
        if (banco.getSaldo() >= valor) {
            banco.setSaldo(banco.getSaldo() - valor);
            System.out.println("Saque de R$" + valor + " realizado. Saldo atual: R$" + banco.getSaldo());
        } else {
            System.out.println("Saldo insuficiente para saque de R$" + valor);
        }
    }
}

