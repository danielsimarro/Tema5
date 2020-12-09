/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafetera;

/**
 *
 * @author NitroPc
 */
public class Cafetera {

    //    Constructor predeterminado, sin parámetros: establece la capacidad máxima en 1000
//    (c.c.) y la cantidad actual en cero (cafetera vacía).
    private double capacidadMaxima;
    private double cantidadActual;

    public Cafetera() {

        this.capacidadMaxima = 1000;
        this.cantidadActual = 0;
    }
//Constructor, que recibe la capacidad máxima y la cantidad actual.
//Si la cantidad actual que se pasa es mayor que la capacidad máxima de la cafetera,
//        se ajustará la cantidad actual a la capacidad máxima.

    public Cafetera(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = capacidadMaxima;
    }

    public Cafetera(double capacidadMaxima, double capacidadActual) {
        this.capacidadMaxima = capacidadMaxima;

        if (capacidadActual > capacidadMaxima) {

            this.cantidadActual = capacidadMaxima;
        } else {

            this.cantidadActual = capacidadActual;
        }
    }
//llenarCafetera(): hace que la cantidad actual sea igual a la capacidad.

    public void llenarCafetera() {
        this.cantidadActual = this.capacidadMaxima;
    }

    public double servirTaza(double cantidadAServir) {
        if (this.cantidadActual < cantidadAServir) {

            cantidadAServir = this.cantidadActual;
            this.cantidadActual = 0;
        } else {

            this.cantidadActual -= cantidadAServir;
        }
        return cantidadAServir;
    }

//    vaciarCafetera(): pone la cantidad de café actual en cero.
    public void vaciarCafetera() {
        this.cantidadActual = 0;
    }
//    agregarCafe(double cantidadAgregar): añade a la cafetera la cantidad de café indicada,
//            teniendo en cuenta que la cafetera no puede rebosar.

    public double agregarCafe(double cantidadAgregar) {
        if ((cantidadAgregar + this.cantidadActual) > this.capacidadMaxima) {

            cantidadActual = this.capacidadMaxima;
        } else {

            cantidadActual += cantidadAgregar;
        }

        return cantidadAgregar;
    }

    @Override
    public String toString() {
        return "Cafetera{" + "capacidadMaxima=" + capacidadMaxima + ", cantidadActual=" + cantidadActual + '}';
    }
    
    
}
