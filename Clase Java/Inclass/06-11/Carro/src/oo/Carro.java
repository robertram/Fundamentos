/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oo;

/**
 *
 * @author robertramirez
 */
public class Carro {
    private boolean estaEncendido;
    
    
    public Carro(){
        System.out.println("Creando un nuevo carro...");
        this.estaEncendido=false;
    }
    
    public void encender(){
        if(estaEncendido){
            System.out.println("Ya esta encendido");
        }
        else{
            estaEncendido=true;
            System.out.println("Ok encendido!");
        }
    }
    public void apagar(){
        if(estaEncendido){
            estaEncendido=true;
            System.out.println("OK apagado!");
        }
        else{
            System.out.println("Ya esta apagado");
    
    }
}
