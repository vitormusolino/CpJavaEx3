package br.com.checkpoint.exercicio3;

public class Conta {
    private String nome;
    private double saldo;
    private int numeroConta;

    public Conta(String nome, double saldo){
        this.nome = nome;
        this.saldo = saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor){
        this.saldo += valor;
        System.out.println("Deposito de R$" + valor + " feito. Valor em conta R$" + this.saldo);
    }

    public void sacar(double valor){
        if(valor > this.saldo){
            System.out.println("Dinheiro insuficiente.");
        }else{
            this.saldo -= valor;
            System.out.println("Saque de R$" + valor + " feito.Valor em conta R$" + this.saldo);
        }
    }
}
