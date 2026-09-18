package Taller_3_modificadorStatic.Ejercicio_2;

public class Matematicas {
    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Error: No se puede dividir entre cero.");
            return 0;
        }
        return a / b;
    }

    public class MainMatematicas {
        public static void main(String[] args) {
            System.out.println("Suma: " + Matematicas.sumar(10, 5));
            System.out.println("Resta: " + Matematicas.restar(10, 5));
            System.out.println("Multiplicación: " + Matematicas.multiplicar(10, 5));
            System.out.println("División: " + Matematicas.dividir(10, 5));
        }
    }
}
