package br.com.checkpoint.exercicio3;

import br.com.checkpoint.exercicio3.interfaces.Rentavel;

public class ContaPoupanca extends Conta  implements Rentavel {


    public ContaPoupanca(String nome, double saldo) {
        super(nome, saldo);
    }

    @Override
    public double calcularRendimento() {
        double saldo = super.getSaldo();
        double rendimento = saldo * 0.05;
        saldo += rendimento;
        System.out.println("Valor rendido no mês R$" + rendimento + " saldo total R$" + saldo);
        return rendimento;
    }
}
