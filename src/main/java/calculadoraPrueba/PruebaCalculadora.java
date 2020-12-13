/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraPrueba;

/**
 *
 * @author NitroPc
 */
public class PruebaCalculadora {
    public static void main(String[] args) {
        
        NumerosReales nr1 = new NumerosReales(3.4);
        System.out.println(nr1);
        nr1.Sumar(5);
        System.out.println(nr1);
        nr1.Dividir(2);
        System.out.println(nr1);
        
        NumerosEnteros ne1 = new NumerosEnteros();
        
        int resultado = ne1.Sumar(5, 8);
        
        System.out.println("El resultado es " + resultado);
    }
}
