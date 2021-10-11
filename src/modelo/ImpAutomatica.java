/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author jairo
 */
public class ImpAutomatica implements ICalculadora {

    @Override
    public double potencia(int b, int e) {
        return Math.pow(b, e);
    }

    @Override
    public double multiplicacion(int a, int b) {
        return a * b;
    }

    @Override
    public double division(int n, int d) {
        return (double)n / d;
    }
    
}
