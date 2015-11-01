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
public class Produto {
    
    private String nome;
    private double preco;
    private String codigo;

    public Produto() {
    }

    public Produto(String nome, double preco, String codigo) {
        this.nome = nome;
        this.preco = preco;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Produto{" + "nome=" + nome + ", preco=" + preco + ", codigo=" + codigo + '}';
    }
    
    
    
    
}
