package com.grupo.tpa.model;

import java.util.ArrayList;

public class Pedido{
  private int numeroMesa;
  private int idPedido;
  private String alteracao;
  private double valor;
  double total;

public void setNumMesa (int numMesa){
  this.numeroMesa = numMesa;
}

public void setId (int id){
  this.idPedido = id;
}

public void setAlteracao (String alt){
  this.alteracao = alt;
}

public int getNumMesa (){
  return this.numeroMesa;
}

public int getId (int id){
  return this.idPedido;
}

public String getAlteracao (String alt){
  return this.alteracao;
}

public void criaComanda(int tipo, Pedido pedido){
  Comanda c = new Comanda();
  this.total = this.total + c.total;
}
}