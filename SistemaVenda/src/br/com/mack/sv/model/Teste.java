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
public class Teste {
    public static void main(String[] args) {
    Compra compra1 = new Compra();
    
    Produto coca = new Produto("Coca-cola", 3.0, "0232");
    
    ItemProduto i = new ItemProduto();
     i.setTipo(coca);
     i.setQtidade(2);
     
     compra1.addItem(i);
     
        System.out.println(i.calcularSubtotal());
        System.out.println(compra1.calcularValor());
     
     
    }
   
    
    
    
    
    
}
