package Taller_3_modificadorStatic.Ejercicio_3;
/*
public class EjemploError {
    public String titulo = "POO"; // Atributo de instancia (no estático)

    public static void mostrarTitulo() {
        // ERROR DE COMPILACIÓN: non-static variable titulo cannot be referenced from a static context
        System.out.println("Título: " + titulo);
    }
}
*/
public class EjemploCorregido {
    public static String titulo = "POO"; // Atributo estático

    public static void mostrarTitulo() {
        System.out.println("Título: " + titulo);
    }
}

