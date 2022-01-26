package com.lucasjava92.bancolucas.dominio;


public class ContaCorrente extends Conta {

    private Double limite = 1000d;
    private Double taxa = 0.5d;

    public ContaCorrente(Cliente cliente, Integer numero, Integer agencia) {
        super(cliente, numero, agencia);
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }

    public Double getSaldoComLimite() {
        return saldo + limite;
    }

    @Override
    public Boolean sacar(Double valor) {
        if (valor <= 0 && getSaldoComLimite() < valor) return false;
        saldo -= valor + taxa;
        return true;
    }

    @Override
    public Boolean depositar(Double valor) {
        if (valor <= 0) return false;
        saldo += (valor - taxa);
        return true;
    }

}
