package Taller_2_UsoDeThis.Ejercicio_01;

public class Producto {
    String nombre;
    double precio;

    //Constructor
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrarProducto() {
        System.out.println("Producto: " + this.nombre + " | Precio: $" + this.precio);
    }
}