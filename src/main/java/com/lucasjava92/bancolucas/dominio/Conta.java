package com.lucasjava92.bancolucas.dominio;

public abstract class Conta {

	    private Cliente cliente;
	    private Integer numero;
	    private Integer agencia;
	    protected Double saldo = 0d;

	    public Conta(Cliente cliente, Integer numero, Integer agencia) {
	        this.cliente = cliente;
	        this.numero = numero;
	        this.agencia = agencia;
	    }

	    public Cliente getCliente() {
	        return cliente;
	    }

	    public void setTitular(Cliente cliente) {
	        this.cliente = cliente;
	    }

	    public Integer getNumero() {
	        return numero;
	    }

	    public Integer getAgencia() {
	        return agencia;
	    }

	    public Double getSaldo() {
	        return saldo;
	    }

	    abstract Boolean sacar(Double valor);

	     abstract Boolean depositar(Double valor);

	      public Boolean transferir(Double valor, Conta favorecido) {
	         if (sacar(valor)) return favorecido.depositar(valor);
	           return false;
	    }

	

}
