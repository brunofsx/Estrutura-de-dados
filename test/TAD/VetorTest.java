/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TAD;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bruno
 */
public class VetorTest {
    
    public VetorTest() {
    }

    /**
     * Test of adiciona method, of class Vetor.
     */
    @Test
    public void testAdiciona() {
      
        String nome = "Bruno";
        
        Vetor vetor = new Vetor();
        
        vetor.adiciona(nome);
        
        System.out.println(vetor);
        
        
        
    }

    /**
     * Test of toString method, of class Vetor.
     */
    @Test
    public void testToString() {
       String nome = "Bruno";
        
        Vetor vetor = new Vetor();
        
        vetor.adiciona(nome);
        
        System.out.println(vetor);
        
        
        
        
    }

    /**
     * Test of contem method, of class Vetor.
     */
    @Test
    public void testContem() {
       
          String nome = "Bruno";
        
        Vetor vetor = new Vetor();
        
        vetor.adiciona(nome);
        
        System.out.println(vetor.contem("Bruno"));
        
        
    }

    /**
     * Test of totalElementos method, of class Vetor.
     */
    @Test
    public void testTotalElementos() {
        String nome = "Bruno", nome2 = "Caio";
        
        
        Vetor vetor = new Vetor();
        
        vetor.adiciona(nome);
        vetor.adiciona(nome2);
        
        System.out.println(vetor.totalElementos());
        
    }

    /**
     * Test of pega method, of class Vetor.
     */
    @Test
    public void testPega() {
       
         String nome = "Bruno", nome2 = "Caio";
        
        
        Vetor vetor = new Vetor();
        
        vetor.adiciona(nome);
        vetor.adiciona(nome2);
        
        System.out.println(vetor.pega(100));
        
        
    }

    /**
     * Test of remover method, of class Vetor.
     */
    @Test
    public void testRemover() {
       String nome = "Bruno", nome2 = "Caio", nome3="Lucas";
        
        
        Vetor vetor = new Vetor();
        
        vetor.adiciona(nome);
        vetor.adiciona(nome2);
        vetor.adiciona(nome3);
        
        
        System.out.println(vetor);
        
        vetor.remover(1);
        
        System.out.println(vetor);
    }

    /**
     * Test of aumentarEspaco method, of class Vetor.
     */
    @Test
    public void testAumentarEspaco() {
        String nome = "Bruno";
         Vetor vetor = new Vetor();
        for (int i = 0; i < 150; i++) {
            vetor.adiciona(nome);
        }
        System.out.println(vetor);
        System.out.println(vetor.totalElementos());
        
    }
    
}
