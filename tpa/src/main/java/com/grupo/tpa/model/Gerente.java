package com.grupo.tpa.model;

import com.grupo.tpa.model.Produto;

public class Gerente{
  public void aplicarDesconto(double desconto, Conta conta){
      conta.calculaDesconto(desconto, conta);
  }

  public void removerPedido(Pedido pedido, Conta conta){
    conta.removePedido(pedido);
  }

  public void cadastrarProduto(Produto produto){
    //produtos.add(produto);
  }

}