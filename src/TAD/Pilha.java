

package TAD;

/**
 *
 * @author Bruno
 */
public class Pilha {
    private int topo;
    private final int max_element=1000;
    Object vet [];

    public Pilha() {
        this.topo = 0;
        this.vet=new Object[max_element];
        
        
    }
    
    

    public Pilha(int tamanho){
        this.vet= new Object[tamanho];
        this.topo=0;
        
        
        
        
    }
    
    
    
    
    public boolean vazia (){
            if(topo==0){
                
                return true;
                
                
            }   
        return false;
    }
    
    public boolean cheia(){
        
        if(topo == vet.length){
            return true;
            
        }
       return false;
        
        
    }
    
    public void push(Object elemento){
        if(this.topo==vet.length){
            
            System.out.println("Pilha cheia");
            
        }
        else{
            
            vet[topo++]= elemento;
            
            
        }
     
        
        
    }
    
       public Object poop(){
           int elemento = 0;
            
            if(vazia()==true){
                
                
                System.out.println("Pilha vazia!");
                return -1;
            }
            else{
               topo--;
                
               return this.vet[topo];
            }
            
            
        }
       public int tamanho(){
           
           
           return this.topo;
       }
       
       public Object elemeTopo(){
           
           return vet[topo-1];
           
       }

    @Override
    public String toString() {
        return "Pilha{" + "topo=" + topo + ", max_element=" + max_element + ", vet=" + vet + '}';
    }

   
       
        
    
    
    
    
}
