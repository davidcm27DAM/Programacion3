package ejercicioExtraPOO;

import java.util.Scanner;

public class Principal {

    public static Scanner sc = new Scanner(System.in);
    Esfera esfera;
    Cilindro cilindro;

    public Principal(int radio){
        esfera = new Esfera(radio);
    }

    public Principal(int radio, int altura){
        cilindro = new Cilindro(radio, altura);
    }

    public static void main(String[] args) {
        run();
    }

    public static void run(){
        double volumen = 0;
        String tipoVolumen = introducirTipo();
        if (tipoVolumen.equalsIgnoreCase("esfera")){
            Principal interfaz = new Principal(introducirRadio());
            volumen = interfaz.esfera.calcularVolumen();

        } else if (tipoVolumen.equalsIgnoreCase("cilindro")){
            Principal interfaz = new Principal(introducirRadio(), introducirAltura());
            volumen = interfaz.cilindro.calcularVolumen();
        } else {
            System.out.println("Error en el valor introducido. \nFin de la ejecución. ");
        }

        System.out.println("El volumen de tu "+tipoVolumen + "es de "+ volumen+" unidades. ");
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
