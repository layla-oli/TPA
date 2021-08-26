package com.grupo.tpa.model;

public class Refeicao extends Produto {
  private String prato;
  private String observacoes;

public Refeicao (String nome, String descricao, double valor, String prato, String obs){
  super.nome = nome;
  super.descricao = descricao;
  super.valor = valor;
  this.prato = prato;
  this.observacoes = obs;
}
public void setPrato (String prato){
  this.prato = prato;
}

public void setObs (String obs){
  this.observacoes = obs;
}

public String getPrato (){
  return this.prato;
}

public String getObs (){
  return this.observacoes;
}

}