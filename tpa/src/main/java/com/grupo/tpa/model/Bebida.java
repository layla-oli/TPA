package com.grupo.tpa.model;

public class Bebida extends Produto {
  private boolean alcool;
  private boolean gelo;
  private String observacoes;

public Bebida (String nome, String descricao, double valor, boolean alcool, boolean gelo, String obs){
  super.nome = nome;
  super.descricao = descricao;
  super.valor = valor;
  this.alcool = alcool;
  this.gelo = gelo;
  this.observacoes = obs;
}

public void setAlcool (boolean alcool){
  this.alcool = alcool;
}

public void setGelo (boolean gelo){
  this.gelo = gelo;
}

public void setObs (String obs){
  this.observacoes = obs;
}

public boolean getAlcool(){
  return this.alcool;
}

public boolean getGelo(){
  return this.gelo;
}

public String getObs(){
  return this.observacoes;
}

}