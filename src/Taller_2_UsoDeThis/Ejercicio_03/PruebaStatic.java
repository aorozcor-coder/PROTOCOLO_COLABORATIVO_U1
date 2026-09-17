package Taller_2_UsoDeThis.Ejercicio_03;

/*

public class PruebaStatic {
    String titulo = "Programación Orientada a Objetos";

    //Metodo estatico 'static'
    public static void mostrarTitulo() {
        System.out.println(this.titulo);
        }
    }

      * ERROR DE COMPILACIÓN:
      * No se puede referenciar 'this' desde un contexto estático.
      * Motivo: 'this' representa a la instancia actual del objeto,
      * mientras que un metodo 'static' pertenece a la clase y no a un objeto concreto.
*/

public class PruebaStatic {
    private String titulo = "Programación Orientada a Objetos";

    // Se remueve la palabra clave 'static' del metodo
    public void mostrarTitulo() {

        // Ahora sí es válido usar 'this' porque el metodo pertenece a una instancia
        System.out.println(this.titulo);
    }
}