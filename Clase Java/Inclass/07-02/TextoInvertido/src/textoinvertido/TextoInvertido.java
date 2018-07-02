/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textoinvertido;

import java.util.Stack;
import java.util.StringTokenizer;

public class TextoInvertido {
    
    public static void main(String[] args) {
        String texto = "Hola Robert como esta";
        String[] parts = texto.split(" ");
        
        StringTokenizer stringTokenizer = new StringTokenizer(texto);
        
        int numpalabras=stringTokenizer.countTokens();
        System.out.println(numpalabras);
        
        for(int i=numpalabras-1;numpalabras>0;i--){
            
            String part = parts[i]; 
            System.out.print(part+" ");
            
        }
        
        
        /*
        String Texto = "Hola Robert Como esta";
        StringTokenizer frase = new StringTokenizer(Texto);
        Stack<String> pila = new Stack<>();
        while (frase.hasMoreTokens()) {
          pila.push(frase.nextToken());
        }
        while (!pila.empty()){
          System.out.print(pila.pop() + " ");
        }
        */
        
        
    }
    
}
