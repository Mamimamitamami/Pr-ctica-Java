/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package suma;

/**
 *
 * @author Mario
 */
public class Suma {

    private int v1, v2, resultado;

    public Suma(int num1, int num2) {
        this.v1 = num1;
        this.v2 = num2;
        
    }
    public void Operacion(){
    resultado = v1 + v2;
    }
    public void Imprimir(){
        Operacion();
        System.out.println("El resultado de la suma es: "+ resultado);
    }
}
