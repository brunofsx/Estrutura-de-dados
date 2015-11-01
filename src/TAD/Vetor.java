/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TAD;

import java.util.Arrays;

/**
 *
 * @author Bruno
 */
public class Vetor {
    
    private Object[] lista = new Object[100];
    private int totalObjetos=0;

    public Vetor() {
    }
    
    
    public void aumentarEspaco(){
        
        if(totalObjetos==lista.length){
           Object [] novo = new Object[totalObjetos*2];
            
            for (int i = 0; i < lista.length; i++) {
                
                novo[i] = lista[i];
                
            }
            
           this.lista = novo; 
        }
        
        
    }
    
    
    public void adiciona(Object o){
       this.aumentarEspaco();
        
        lista[totalObjetos]= o;
        
        totalObjetos++;
        
        
        
    }
    
    public boolean contem(Object o){
        
        
        for (Object o2: lista) {
            if(o2.equals(o)){
                
                return true;
                
            }
            
            
        }
        
        return false;
    }
    

    @Override
    public String toString() {
        return Arrays.toString(lista);
    }
    
    public int totalElementos(){
        
        
        return this.totalObjetos;
        
        
      
        
        
    }
    
      public Object pega(int posicao){
            
           return lista[posicao]; 
            
        }
      
      public void remover(int posicao){
          
          for(int i= posicao; i<= this.totalObjetos-1; i++){
              
              lista[i]=lista[i+1];
              
          }
          totalObjetos--;
          
      }
    
    
    
}
