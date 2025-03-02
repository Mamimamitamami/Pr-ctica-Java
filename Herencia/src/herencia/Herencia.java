/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia;
import operaciones.ClaseHija_Resta;
import operaciones.ClaseHija_Suma;
/**
 *
 * @author Mario
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ClaseHija_Suma operacionSuma = new ClaseHija_Suma();
        operacionSuma.PedirDatosSuma();
        operacionSuma.Suma();
        operacionSuma.ImprimirResultadoSuma();
        
        ClaseHija_Resta operacionResta = new ClaseHija_Resta();
        operacionResta.PedirDatosResta();
        operacionResta.Resta();
        operacionResta.ImprimirResultadoResta();
        
        
    }
    
}
