package br.com.checkpoint.exercicio3;

import br.com.checkpoint.exercicio3.tipocontas.ContaCorrente;
import br.com.checkpoint.exercicio3.tipocontas.ContaPoupanca;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<ContaCorrente> contasCorrente;
    private List<ContaPoupanca> contasPoupanca;

    public Banco() {
        this.contasCorrente = new ArrayList<>();
        this.contasPoupanca = new ArrayList<>();
    }

    public void adicionarContaCorrente(ContaCorrente conta) {
        contasCorrente.add(conta);
    }

    public void adicionarContaPoupanca(ContaPoupanca conta) {
        contasPoupanca.add(conta);
    }

    public void aplicarTributos() {
        for (ContaCorrente conta : contasCorrente) {
            conta.calcularImposto();
        }
    }

    public void aplicarRendimentos() {
        for (ContaPoupanca conta : contasPoupanca) {
            conta.calcularRendimento();
        }
    }

    public void mostrarSaldos() {
        for (ContaCorrente conta : contasCorrente) {
            System.out.println("Conta Corrente - Saldo: R$" + conta.getSaldo());
        }
        for (ContaPoupanca conta : contasPoupanca) {
            System.out.println("Conta Poupança - Saldo: R$" + conta.getSaldo());
        }
    }
}