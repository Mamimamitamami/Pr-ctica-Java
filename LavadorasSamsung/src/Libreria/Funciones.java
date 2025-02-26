/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libreria;

/**
 *
 * @author Mario
 */
public class Funciones {
    //Clase para las funciones logicas de una lavadora

    private int kilos = 0; //Cantidad de kilos de ropa que lleva
    private int llenadoCompleto = 0; //Será un boolean, si es 0 estará vacio, 1 es que estará lleno
    private int TipoDeRopa = 0; //Si la ropa es de color el valor será 1, si es blanca, será 0
    private int LavadoCompleto = 0; //Si ha terminado de lavar será 1, si no ha terminado será 0
    private int SecadoCompleto = 0; //Si ha terminado de secar será 1, si no ha terminado será 0

    public Funciones(int kilos, int TipoDeRopa) {
        this.kilos = kilos;
        this.TipoDeRopa = TipoDeRopa;
    }

    private void Llenado() {
        if (kilos <= 12) {
            llenadoCompleto = 1;
            System.out.println("LLenando...");
            System.out.println("LLenado completo");
        } else {
            System.out.println("La carga de ropa es muy pesada, reduce la carga");
        }
    }

    private void Lavado() {
        Llenado();
        if (llenadoCompleto == 1) {
            if (TipoDeRopa == 1) {
                System.out.println("Ropa de color / Lavado intenso");
                System.out.println("Lavando");
                LavadoCompleto = 1;
            } else if (TipoDeRopa == 0) {
                System.out.println("Ropa blanca / Lavado suave");
                System.out.println("Lavando");
                LavadoCompleto = 1;
            } else {
                System.out.println("El tipo de ropa seleccoinado no es disponible");
                System.out.println("Se lavará como ropa blanca");
                System.out.println("Lavando");
                LavadoCompleto = 1;
            }
        }
    }

    private void Secado() {
        Lavado();
        if (LavadoCompleto == 1) {
            System.out.println("Secando");
            SecadoCompleto = 1;
        }
    }

    public void CicloFinalizado() {
        Secado();
        if (SecadoCompleto == 1) {
            System.out.println("Ciclo Finalizado, ropa limpia");
        }
    }

    //Setter y Getter

    public int getTipoDeRopa (){
    return TipoDeRopa;
    }
    
    public void setTipoDeRopa(int TipoDeRopa) {
    this.TipoDeRopa = TipoDeRopa;
    }
    
}
