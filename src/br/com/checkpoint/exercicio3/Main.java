package br.com.checkpoint.exercicio3;

public class Main {



    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente("Vitor", 500);
        ContaPoupanca contaPoupanca = new ContaPoupanca("Vitor", 600);

        contaCorrente.depositar(500);
        contaCorrente.sacar(200);
        contaCorrente.calcularImposto();
    }
}
