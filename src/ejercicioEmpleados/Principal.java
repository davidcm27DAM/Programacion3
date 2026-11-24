package ejercicioEmpleados;

import java.util.Scanner;

public class Principal {

    public static Scanner sc = new Scanner(System.in);
    Empleado empleado1;
    Empleado empleado2;

    public Principal() {
        empleado1 = new Empleado();
        empleado2 = new Empleado("Agustín", "Alvarado", 60, 1500);
    }

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Principal interfaz = new Principal();
        interfaz.empleado1.crearEmplado();

        // Seguimiento de los datos introducidos
        System.out.println("Datos actuales: ");
        System.out.println(interfaz.empleado1);
        System.out.println(interfaz.empleado2);

        interfaz.empleado1.incrementarSalario();
        interfaz.empleado2.incrementarSalario();

        /*
        * Resultado de la llamada al método incrementarSalario();
         */
        System.out.println("Datos tras el incremento de salario: ");
        System.out.println(interfaz.empleado1);
        System.out.println(interfaz.empleado2);



    }

}
