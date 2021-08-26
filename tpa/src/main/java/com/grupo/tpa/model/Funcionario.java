package com.grupo.tpa.model;

import java.util.ArrayList;

public abstract class Funcionario{
  private String nome;
  private String login;
  private String senha;
  private String tipo;
  private final ArrayList<Conta> contas = new ArrayList();
  
public Conta getConta(){
  return null;
}
public void setConta(){
  
}
public Funcionario(String nome){
  this.nome = nome;
}

public void setNome (String nome){
  this.nome = nome;
}

public void setLogin (String login){
  this.login = login;
}

public void setSenha (String senha){
  this.senha = senha;
}

public void setTipo (String tipo){
  this.tipo = tipo;
}

public String getNome (){
  return this.nome;
}

public String getLogin (){
  return this.login;
}

public String getSenha (){
  return this.senha;
}

public String getTipo (){
  return this.tipo;
}

}