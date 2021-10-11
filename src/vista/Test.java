/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import modelo.*;

/**
 *
 * @author jairo
 */
public class Test {
    public static void main(String[] args) {
        
        int modoOperacion=1;
        ICalculadora calculadora;
        
        if(modoOperacion == 0 ) // operacio automatica
            calculadora = new ImpAutomatica();
        else
            calculadora = new ImpBasica();
        
        
        System.out.println("Potecia de 10 a la 5 : " + calculadora.potencia(10, 5));
        System.out.println("Multiplicacion de 10 * 5: " + calculadora.multiplicacion(10,5));
        System.out.println("Division de 10 / 5 : " + calculadora.division(10,5));
        
    }
}
