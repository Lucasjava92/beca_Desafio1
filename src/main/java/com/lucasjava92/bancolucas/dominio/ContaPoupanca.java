package com.lucasjava92.bancolucas.dominio;


public class ContaPoupanca extends Conta implements Rendimentos {

    public ContaPoupanca(Cliente cliente, Integer numero, Integer agencia) {
        super(cliente, numero, agencia);
    }

    @Override
    public Boolean sacar(Double valor) {
        if (saldo < valor) return false;
        saldo -= valor;
        return true;
    }

    @Override
    public Boolean depositar(Double valor) {
        if (valor < 0) return false;
        saldo += valor;
        return true;
    }

    @Override
    public void atualizar(Double taxaRendimento) {
        saldo += saldo * (taxaRendimento / 100);
    }

}