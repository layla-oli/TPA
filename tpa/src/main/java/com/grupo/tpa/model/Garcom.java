package com.grupo.tpa.model;

public class Garcom{
  public void addPedido(Pedido pedido, Conta conta){
    conta.addPedido(pedido);
  }
}