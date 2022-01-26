package com.lucasjava92.bancolucas.dominio;
/*
 * @autor: Lucas da Silva Santos
 * Desafio Beca java
 * */

public class Banco {

    public static void main(String[] args) {
        Cliente cliente = new Cliente(null, null, null);
        ContaPoupanca contaPoupanca = new ContaPoupanca(cliente, 1, 10);
        ContaCorrente contaCorrente = new ContaCorrente(cliente, 2, 10);
        ContaEspecial contaEspecial = new ContaEspecial(cliente, 3, 10);
        
        //Conta Poupanca
        contaPoupanca.depositar(1000d);		
        contaPoupanca.sacar(50d);
        contaPoupanca.transferir(50d, contaCorrente);
        System.out.println(String.format("Conta Poupan�a - Saldo: R$ %.2f", contaPoupanca.getSaldo()));
        
        //Conta Corrente
        contaCorrente.depositar(560d);
        contaCorrente.sacar(200d);
        contaCorrente.transferir(145d, contaEspecial);
        System.out.println(String.format("Conta Corrente - Saldo: + limite R$ %.2f", contaCorrente.getSaldoComLimite()));
        
        //Conta Especial
        contaEspecial.depositar(3450d);
        contaEspecial.sacar(350d);
        contaEspecial.transferir(120d, contaPoupanca);
        System.out.println(String.format("Conta Especial - Saldo: + limite R$ %.2f", contaEspecial.getSaldoComLimite()));
        
        //Aplica��o da Taxa de Rendimento
        contaPoupanca.atualizar(1d);
        contaEspecial.atualizar(2.5d);
        System.out.println(String.format("Saldo C.P.: - R$ %.2f \nSaldo C.E.: - R$ %.2f", contaPoupanca.getSaldo(), contaEspecial.getSaldo()));
        
    }

}