package Taller_3_modificadorStatic.Ejercicio_1;

public class Coche {
    public String marca;
    public String modelo;
    public static int contadorCoches = 0;

    // Constructor de la clase
    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        contadorCoches++; // Se incrementa cada vez que se crea un nuevo Coche
    }

    public static void mostrarContador() {
        System.out.println("Total de coches creados: " + contadorCoches);
    }
}