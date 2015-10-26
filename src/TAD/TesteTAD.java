
package TAD;

/**
 *
 * @author Bruno
 */
public class TesteTAD {
    
    
    public static void main(String[] args) {
        int elemento = 5;
       
        
        Pilha pilha = new Pilha(3);
        
        pilha.push(5);
        pilha.push(4);
        pilha.push(2);
       
        System.out.println(pilha.cheia());
    
        System.out.println(pilha.toString());
        
        System.out.println(pilha.tamanho());
        
        System.out.println(pilha.elemeTopo());
        
        System.out.println(pilha.poop());
        System.out.println("testes");
      
        
        
    }
          
    
}
