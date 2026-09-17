package Taller_2_UsoDeThis.Ejercicio_02;

public class Estudiante {
    String nombre;
    int edad;

    public Estudiante(){
        this("Sin nombre", 0);
    }

    public Estudiante(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    public void mostrarDetalles() {
        System.out.println("Estudiante: " + this.nombre + " | Edad: " + this.edad + " años");
    }
}
