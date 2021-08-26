package com.grupo.tpa.model;

public class Mesa{
  private int numero;
  private boolean ocupada;
  private boolean reservada;
  private Conta conta;

public void setNumero (int num){
  this.numero = num;
}

public void setOcupada (boolean ocup){
  this.ocupada = ocup;
}

public void setReservada (boolean reserva){
  this.reservada = reserva;
}

public int getNumero (){
  return this.numero;
}

public boolean getOcupada (){
  return this.ocupada;
}

public boolean getReservada (){
  return this.reservada;
}

public void criaConta(){
    
}

public void liberarMesa (Mesa mesa){
  this.ocupada = false;
}

public void ocuparMesa (Mesa mesa){
  this.ocupada = true;
}

public void reservarMesa (Mesa mesa){
  this.reservada = true;
}

public void cancelarReserva (Mesa mesa){
  this.reservada = false;
}
}