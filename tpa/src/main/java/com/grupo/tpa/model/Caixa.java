package com.grupo.tpa.model;

public class Caixa{
  public double fecharConta(Conta conta){
    conta.setFechada(true);
    double total = conta.getTotal()*1.1;// 10% do garçom!!!
    return total;
  }

  public void efetuarPagamento(Conta conta){
    
  }
}