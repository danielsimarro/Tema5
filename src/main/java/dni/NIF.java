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
        this.DNI = "0";
        this.letra = 'o';
    }

    public NIF(String DNI) {
        this.DNI = DNI;
        this.letra = calcularLetra(DNI);

    }

    private static char calcularLetra(String DNI) {
        //String = array de char
        String caracteres = "TRWAGMYFPDXBNJZSQVHLCKE";
        //resto = el resto de el numero que se le pasa lo casteo a int lo divido entre 23
        int resto = Integer.parseInt(DNI) % 23;
        //Devuelvo los caracteres de la posición que sea el resto
        return caracteres.charAt(resto);
    }

    public String getDNI() {
        return DNI;
    }

    public char getLetra() {
        return letra;
    }

    // Estático porque es de clase (no referencia ningún this)
    public static String leer() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el número de DNI");

        return teclado.nextLine();
    }

    @Override
    public String toString() {
        return DNI + "-" + letra;
    }

    public void mostrar() {
        System.out.println(toString());

    }

}
