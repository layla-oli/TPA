package com.grupo.tpa.model;
import java.util.ArrayList;
//criar uma lista do tipo pedido

public class Conta {
  private boolean fechada;
  private double total;
  private ArrayList<Pedido> pedidos = new ArrayList(); 
  private ArrayList<Mesa> mesas = new ArrayList();
  
public Conta(boolean fechada, double total, ArrayList<Pedido> listap, ArrayList<Mesa> listam){
  this.fechada = fechada;
  this.total = total;
  this.pedidos = listap;
  this.mesas = listam;
}

public void Conta(Pedido pedido){
  this.pedidos.add(pedido);
}

public void setFechada(boolean fechada){
  this.fechada = fechada;
}

public void setTotal(double tot){
  this.total = tot;
}


public boolean getFechada(){
  return this.fechada;
}

public double getTotal(){
  return this.total;
}

public void addPedido(Pedido pedido){
  if(this.fechada==false){
  pedidos.add(pedido);
  }
}

public void removePedido(Pedido pedido){
  if(pedidos.contains(pedido))
      pedidos.remove(pedidos.indexOf(pedido));

}

public void calculaTotal(Conta conta){
  double tot = 0;
  for (Pedido p: pedidos){
      tot = tot + p.total;
  }
  conta.setTotal(tot);
}

public void calculaDesconto(double desconto, Conta conta){
    calculaTotal(conta);
    double t = conta.getTotal();
    t = t*desconto;
    conta.setTotal(t);
}
}