/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mack.sv.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bruno
 */
public class Compra {
    
    private double valorTotal;
   private List<ItemProduto> itens = new ArrayList();

    public Compra() {
    }
    
    public void addItem(ItemProduto i){
        
        itens.add(i);
        
        
    }
    
    public Compra(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<ItemProduto> getItemProduto() {
        return itens;
    }

    public void setItemProduto(List<ItemProduto> ItemProduto) {
        this.itens = ItemProduto;
    }
    
    
    public double calcularValor(){
      double total=0;
        for(ItemProduto i: itens){
            total+=i.calcularSubtotal();
            
            
        }
        return total;
    }
    
}
