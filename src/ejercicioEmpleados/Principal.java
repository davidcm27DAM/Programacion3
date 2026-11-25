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
        Principal interfaz = new Principal();
        interfaz.run();
    }

    public void run() {

        empleado1.crearEmplado();

        // Seguimiento de los datos introducidos
        System.out.println("Datos actuales: ");
        System.out.println(empleado1);
        System.out.println(empleado2);

        empleado1.incrementarSalario();
        empleado2.incrementarSalario();

        /*
        * Resultado de la llamada al método incrementarSalario();
         */
        System.out.println("Datos tras el incremento de salario: ");
        System.out.println(empleado1);
        System.out.println(empleado2);



    }

}
