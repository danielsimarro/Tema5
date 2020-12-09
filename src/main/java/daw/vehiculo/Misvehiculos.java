/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.vehiculo;

/**
 *
 * @author NitroPc
 */
public class Misvehiculos {
    public static void main(String[] args) {
        
        Vehiculo miCacharro = new Vehiculo("dvd", "opel","astra","negro",120.20);
        
       
    
        System.out.println("Matricula: " + miCacharro.matricula);
        System.out.println("Marca: " + miCacharro.marca);
        System.out.println("Modelo: " + miCacharro.modelo);
        System.out.println("Color: " + miCacharro.color);
        System.out.println("Precio: " + miCacharro.tarifa + " €");
        
        
        
        System.out.println("Matricula: " + miCacharro.getMatricula());
        System.out.println("Marca: " + miCacharro.getMarca());
        System.out.println("Modelo: " + miCacharro.getMarca());
        System.out.println("Color: " + miCacharro.getColor());
        System.out.println("Precio: " + miCacharro.getTarifa() + " €");
    
    
    
    
    }
    
}
