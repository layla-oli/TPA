package com.grupo.tpa.model;

import com.grupo.tpa.model.Produto;
import java.util.ArrayList;

public class Comanda{
  private int tipo;
  double total;
  private ArrayList<Produto> produtos = new ArrayList();

public Comanda(int tipo, ArrayList<Produto> lista){
  this.tipo = tipo;
  this.produtos = lista;
}  

    Comanda() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

public void setTipo (int type){
  /*NÃO SEI O PQ NÃO FUNCIONA AQUI, TESTAR DEPOIS NO ECLIPSE;
  for(Produto p : listaProdutos){
  if(p instaceof Refeicao){
    type = 0;
    break;
  }else{
    type = 1;
    break;
  }
  }
  */
  this.tipo = type;
}

public void setTotal(){
    for(Produto p: produtos){
        this.total = this.total + p.valor;
    }
}

public double getTotal(){
    return this.total;
}
public int getTipo (){
  return this.tipo;
}

public void addRefeicao (Refeicao ref){

}

public void removeRefeicao (Refeicao ref){

}

public void addBebida (Bebida beb){

}

public void removeBebida (Bebida beb){
  
}
}