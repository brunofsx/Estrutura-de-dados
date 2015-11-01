/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mack.sv.model;

/**
 *
 * @author Bruno
 */
public class ItemProduto {
    
    private int qtidade;
    
    private Produto tipo;

    public int getQtidade() {
        return qtidade;
    }

    public void setQtidade(int qtidade) {
        this.qtidade = qtidade;
    }

    public Produto getTipo() {
        return tipo;
    }

    public void setTipo(Produto tipo) {
        this.tipo = tipo;
    }
    
    public double calcularSubtotal(){
        
       return this.tipo.getPreco()*qtidade;
        
        
        
    }
    
    
    
}
