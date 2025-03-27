package br.com.checkpoint.exercicio3;

import br.com.checkpoint.exercicio3.tipocontas.ContaCorrente;
import br.com.checkpoint.exercicio3.tipocontas.ContaPoupanca;

public class Main {



    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente("Vitor", 500);
        ContaPoupanca contaPoupanca = new ContaPoupanca("Vitor", 600);

        contaCorrente.calcularImposto();
        contaCorrente.depositar(500);
        contaCorrente.sacar(200);

        contaPoupanca.calcularRendimento();
        contaPoupanca.depositar(500);
        contaPoupanca.sacar(200);


    }
}
