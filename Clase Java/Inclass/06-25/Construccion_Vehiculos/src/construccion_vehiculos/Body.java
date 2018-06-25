/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package construccion_vehiculos;

public class Body {
    
    public void Firstline(int length){
        for(int i = 0; i < length-2 ;i++){
            System.out.print("_");
        }
        System.out.print("\n");
    }
    
    public void Secondline(int length){
        System.out.print("|");
        for(int i = 0; i < length-4 ;i++){
            System.out.print(" ");
        }
        System.out.println("[]\\");
        
    }
}
