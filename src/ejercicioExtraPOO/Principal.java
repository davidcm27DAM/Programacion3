package ejercicioExtraPOO;

import java.util.Scanner;

public class Principal {

    public static Scanner sc = new Scanner(System.in);
    Esfera esfera1;
    Cilindro cilindro1;

    public Principal(){
        esfera1 = new Esfera();
        cilindro1 = new Cilindro();
    }

    public static void main(String[] args) {
        run();
    }

    public static void run(){
        int radio = 0;
        String tipoVolumen = introducirTipo();
        if (tipoVolumen.equalsIgnoreCase("esfera")){
            radio = introducirRadio();
        } else if (tipoVolumen.equalsIgnoreCase("cilindro")){
            radio = introducirRadio();
            int altura = introducirAltura();
        } else {
            System.out.println("Error en el valor introducido. ");
        }

    }

    public static String introducirTipo(){
        System.out.println("Introduzca el tipo de volumen: \"cilindro\" o \"esfera\" ");
        return sc.nextLine();
    }

    public static int introducirNumero(String texto){
        int dato = 0;
        do{
            System.out.println(texto);
            if (sc.hasNextInt()){
                dato = sc.nextInt();
                if (dato < 1){
                    System.out.println("El número introducido no puede ser menor a 0. ");
                }

            } else {
                System.out.println("Error en el tipo de dato. ");
                sc.next();
            }

        } while (dato < 1);
        return dato;
    }

    public static int introducirRadio(){
        return introducirNumero("Introduce el radio: ");
    }

    public static int introducirAltura(){
        return introducirNumero("Introduce la altura: ");
    }
}
