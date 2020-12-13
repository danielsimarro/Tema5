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
public class NumerosReales {
    
    private double atributo;
    
    public NumerosReales(){
        
    }

    public NumerosReales(double atributo) {
        this.atributo = atributo;
    }

    public double getAtributo() {
        return atributo;
    }

    public void setAtributo(double atributo) {
        this.atributo = atributo;
    }
    
    public void Sumar (double num){
        this.atributo += num;
    }
    
    public void Restar (double num){
        this.atributo -= num;
    }
    
    public void Multiplicar (double num){
        this.atributo *= num;
    }
    
    public void Dividir (double num){
        if(num!=0){
            this.atributo /= num;
        }
        
    }

    @Override
    public String toString() {
        return "NumerosReales{" + "atributo=" + atributo + '}';
    }
    
    
}
