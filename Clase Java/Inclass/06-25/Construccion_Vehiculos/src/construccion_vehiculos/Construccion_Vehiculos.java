/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package construccion_vehiculos;

public class Construccion_Vehiculos {

    public static void main(String[] args) {
        
        Body roof=new Body();
        Body doors=new Body();
        Chasis floor=new Chasis();
        Carro united=new Carro();
        
        roof.Firstline(14);
        doors.Secondline(14);
        floor.Thirdline(14);
        united.ejes(14, 3);
    }
    
}
