package ejercicioEmpleados;

import java.util.Scanner;

public class Principal {

    public static Scanner sc = new Scanner(System.in);
    Empleado e1;

    public Principal() {
        e1 = new Empleado();
    }

    public static void main(String[] args) {
        run();
    }

    public static void run() {

        Principal interfaz = new Principal();
        interfaz.e1.crearEmplado();
        Empleado empleado2 = new Empleado("Agustín", "Alvarado", 60, 1500);

        System.out.println(interfaz.e1);
        System.out.println(empleado2);

        interfaz.e1.incrementarSalario();
        empleado2.incrementarSalario();

        System.out.println(interfaz.e1);
        System.out.println(empleado2);



    }

}
