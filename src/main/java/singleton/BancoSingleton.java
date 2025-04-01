package com.dio.project.singleton;

public class BancoSingleton {
    private static BancoSingleton instancia;
    private double saldo;

    private BancoSingleton() {
        this.saldo = 0.0;
    }

    public static BancoSingleton getInstance() {
        if (instancia == null) {
            instancia = new BancoSingleton();
        }
        return instancia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
