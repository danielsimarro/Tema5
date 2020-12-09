/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dni;

import java.util.Scanner;

/**
 *
 * @author NitroPc
 */
public class NIF {

    private String DNI;

    private char letra;

    public NIF() {
    }

    public NIF(String DNI) {
        this.DNI = DNI;
        
        int numeros= Integer.parseInt(DNI);
        
        int resto = numeros%23;
        
        switch(resto){
            case 0:
                this.letra=84;
                break;
        }

    }

    public String getDNI() {
        return DNI;
    }

    public char getLetra() {
        return letra;
    }

    public static String leer() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el número de DNI");
        String numeroDni = teclado.next();

        return numeroDni;
    }

    @Override
    public String toString() {
        return "NIF{" + "DNI=" + DNI + ", letra=" + letra + '}';
    }

}
