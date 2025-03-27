package br.com.checkpoint.exercicio3.tipocontas;

import br.com.checkpoint.exercicio3.Conta;
import br.com.checkpoint.exercicio3.interfaces.Imposto;

public class ContaCorrente extends Conta implements Imposto {

    public ContaCorrente(String nome, double saldo) {
        super(nome, saldo);
    }

    @Override
    public double calcularImposto() {
        double saldo = super.getSaldo();
        double imposto = saldo * 0.02;
        saldo -= imposto;

        super.setSaldo(saldo);

        System.out.println("Valor do imposto R$" + imposto + " valor da conta agora R$" + saldo);
        return imposto;
    }
}
