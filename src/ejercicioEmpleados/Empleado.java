package ejercicioEmpleados;

import static ejercicio1.Principal.sc;

public class Empleado {

    private String nombre;
    private String apellido;
    private int edad;
    private int salario;

    public Empleado() {

    }

    public Empleado(String nombre, String apellido, int edad, int salario) {
        setNombre(nombre);
        setApellido(apellido);
        setEdad(edad);
        setSalario(salario);
    }

    public void crearEmplado() {
        setNombre(introducirNombre());
        System.out.println("Introduzca el apellido: ");
        setApellido(sc.nextLine());
        setEdad(introducirEdad());
        setSalario(introducirSalario());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                '}';
    }

    /*
    Se asignará un valor al atributo nombre siempre que se
    introduzca letras mayúsculas y minúsculas de la “a” a la “z”, así
    como espacios. En caso contrario nombre debe valer null
     */

    private String introducirNombre() {
        String nombre;

        System.out.println("Introduzca el nombre (caracteres alfabéticos): ");
        nombre = sc.nextLine();

        if (nombre.matches("[A-Za-z]+")) {
            return nombre;
        } else {
            return null;
        }
    }

    /*
    Se asignará un valor al atributo edad siempre y cuando sea un
    valor mayor a cero. En caso contrario edad debe valer cero
     */
    private int introducirEdad() {
        int edad = -1;
        do {
            System.out.println("Introduzca la edad: ");
            if (sc.hasNextInt()) {
                edad = sc.nextInt();
                if (edad < 0) {
                    System.out.println("La edad no puede ser negativa. ");
                }
            } else {
                System.out.println("Error en el tipo de datos. ");
                sc.next();
            }
        } while (edad < 0);
        return edad;
    }

    private int introducirSalario() {
        int salario = 0;

        do {
            System.out.println("Introduzca el salario: ");
            if (sc.hasNextInt()) {
                salario = sc.nextInt();
                if (salario < 1) {
                    System.out.println("El salario ha de ser positivo. ");
                }

            } else {
                System.out.println("Error en el tipo de datos. ");
                sc.next();
            }

        } while (salario < 1);

        return salario;
    }

    public void incrementarSalario(){
        int edad = getEdad();
        if (edad >= 18 && edad <= 30){
            setSalario(getSalario()+100);
        } else if (edad >= 31 && edad <=50 ){
            setSalario(getSalario()+150);
        } else if (edad >50){
            setSalario(getSalario()+200);
        }
    }
}
