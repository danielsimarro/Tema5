/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dni;

/**
 *
 * @author NitroPc
 */
public class PruebaNIF {
    public static void main(String[] args) {
        
        NIF persona1 = new NIF();
        
        System.out.println(persona1);
        
       NIF persona2 = new NIF("23");
       
        System.out.println(persona2);
    }
}
