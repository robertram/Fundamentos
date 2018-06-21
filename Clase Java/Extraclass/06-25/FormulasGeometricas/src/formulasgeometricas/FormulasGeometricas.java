/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulasgeometricas;

public class FormulasGeometricas {

    public static void main(String[] args) {
        Menus menu_principal=new Menus();
        Menus Scann=new Menus();
        Menus decision=new Menus();
        Menus menu2=new Menus();
        Cuadrado formcuadrado=new Cuadrado();
        Rectangulo formrectang=new Rectangulo();
        Circulo formcirc=new Circulo();
        Triangulo_equilatero formequilat=new Triangulo_equilatero();
        Triangulo_isoceles formisoceles=new Triangulo_isoceles();
        Pentagono_regular formpentag=new Pentagono_regular();
        
        
        boolean i;
        
        while(i=true){
            menu_principal.menu1();
            int accion = decision.decision();
            if (accion>3 || accion<1){
                System.out.println("Introduzca un numero valido!");
            }
            if (accion==3){
                System.out.println("Vuelva pronto");
                break;
            }
            if (accion==1){  //area 
                menu2.menufiguras();
                int accion2=Scann.decision();
                if (accion2>6 || accion2<1){
                    System.out.println("Introduzca un numero valido!");
                }
                if (accion2==1){// cuadrado
                    int lados=formcuadrado.tamaño_lados();
                    formcuadrado.areacuadrado(lados);
                }
                if (accion2==2){// reactangulo
                    int base=formrectang.base();
                    int altura=formrectang.altura();
                    formrectang.perimetrorectangulo(base, altura);
                }
                if (accion2==3){// circulo
                    int radio=formcirc.radio();
                    formcirc.areacirculo(radio);
                }
                if (accion2==4){// equilatero
                    int base=formequilat.base();
                    int altura=formequilat.altura();
                    formequilat.areaequilatero(base, altura);
                }
                if (accion==5){// isoceles
                    int base=formisoceles.base();
                    int altura=formisoceles.altura();
                    formisoceles.areaisoceles(base, altura);
                }
                if (accion==6){// Pentagono
                    int numlados=formpentag.num_lados();
                    int tamaño_lados=formpentag.tamaño_lados();
                    int apotema=formpentag.apotema();
                    formpentag.areapentagono(apotema, numlados, numlados);
                }
            }
            if (accion==2){   //perimetro
                menu2.menufiguras();
                int accion2=Scann.decision();
                if (accion2>6 || accion2<1){
                    System.out.println("Introduzca un numero valido!");
                }
                if (accion2==1){// cuadrado
                    int lados=formcuadrado.tamaño_lados();
                    formcuadrado.perimetrocuadrado(lados);
                }
                if (accion2==2){// rectangulo
                    int base=formrectang.base();
                    int altura=formrectang.altura();
                    formrectang.perimetrorectangulo(base, altura);
                }
                if (accion2==3){// circulo
                    int radio=formcirc.radio();
                    formcirc.perimetrocirculo(radio);
                }
                if (accion2==4){// equilatero
                    int lados=formequilat.tamaño_lados();
                    formequilat.perimetroequilatero(lados);
                }
                if (accion==5){// isoceles
                    int lados=formisoceles.tamaño_lados();
                    formisoceles.perimetroisoceles(lados);
                }
                if (accion==6){
                    int numlados=formpentag.num_lados();
                    int lados=formpentag.tamaño_lados();
                    formpentag.perimetropentagono(numlados, lados);
                }
            }
        }    
    }
    
}
