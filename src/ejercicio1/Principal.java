package ejercicio1;

import java.util.Scanner;

public class Principal {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        generarCoche();

    }

    public static void generarCoche() {
        String marca = pedirMarca();
        int baseImponible = pedirBaseImponible();
        Coche coche1 = new Coche(marca, baseImponible);
        System.out.println(coche1);
    }

    public static String pedirMarca() {
        System.out.println("Introduce la marca del coche: ");
        return sc.nextLine();
    }

    public static int pedirBaseImponible() {
        int baseImponible = 0;
        do {
            System.out.println("Introduce el precio sin IVA (base imponible): ");
            if (sc.hasNextInt()) {
                baseImponible = sc.nextInt();
                if (baseImponible < 1) {
                    System.out.println("El precio no puede ser menor que 1.");
                }
            } else {
                System.out.println("Error en el tipo de dato. ");
                sc.next();
            }

        } while (baseImponible < 1);

        return baseImponible;
    }
}
