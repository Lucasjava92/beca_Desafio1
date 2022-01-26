package com.lucasjava92.bancolucas.dominio;


public class ContaEspecial extends ContaCorrente implements Rendimentos {

    public ContaEspecial(Cliente cliente, Integer numero, Integer agencia) {
        super(cliente, numero, agencia);
        setLimite(5000d);
        setTaxa(0.25d);
    }

    @Override
    public void atualizar(Double taxaRendimento) {
        saldo += saldo * (taxaRendimento / 100);
    }

}
