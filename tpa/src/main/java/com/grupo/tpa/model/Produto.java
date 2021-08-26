package com.grupo.tpa.model;


public abstract class Produto {
  String nome;
  String descricao;
  double valor;

public void setNome (String name){
  this.nome = name;
}

public void setDescricao (String desc){
  this.descricao = desc;
}

public void setValor (double valor){
  this.valor = valor;
}

public String getNome (){
  return this.nome;
}

public String getDescricao (){
  return this.descricao;
}

public double getValor(){
  return this.valor;
}

}