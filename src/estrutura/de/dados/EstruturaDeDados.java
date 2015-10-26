/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrutura.de.dados;

/**
 *
 * @author Bruno
 */
public class EstruturaDeDados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vetor []= {5, 6, 2, 1, 7};
      
       
        selection(vetor);
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]);
        }
    }
    
    
    public static void ordenarPivo(int vet []){
        int aux; 
        for (int i = 0; i < vet.length; i++) {
            aux = vet[0];
            if(vet[i]<aux){
                
                
                
            }
            
        }
        
        
    }
    
    public static void selection(int[] array) {
	for (int fixo = 0; fixo < array.length - 1; fixo++) {
		int menor = fixo;
		
		for (int i = menor + 1; i < array.length; i++){
			if (array[i] < array[menor]){
				menor = i;
		                 System.out.println(menor);
                        }
}
		if (menor != fixo) {
			// Troca
                        int t = array[fixo];
                        array[fixo] = array[menor];
                        array[menor] = t;
		}
	}
}
    
}
