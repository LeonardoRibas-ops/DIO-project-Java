package com.dio.project.strategy;

import com.dio.project.singleton.BancoSingleton;

public class Deposito implements OperacaoBancaria {
    @Override
    public void executar(double valor) {
        BancoSingleton banco = BancoSingleton.getInstance();
        banco.setSaldo(banco.getSaldo() + valor);
        System.out.println("Depósito de R$" + valor + " realizado. Saldo atual: R$" + banco.getSaldo());
    }
}

