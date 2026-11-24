package importanciaGetSet;

public class Temperatura {

    public final int TEMPERATURA_ALTA = 32;
    public final int TEMPERATURA_BAJA = 3;
    public final int VALOR = 5;
    private double grados;

    public Temperatura() {
        grados = 0;
    }

    public Temperatura(double grados) {
        this.grados = grados;
    }

    public double getGrados() {
        return grados*9/5+32;
    }

    public void visualizar() {
        System.out.println("La temperatura de hoy es: " + grados);
    }

    public void subirTemperatura() {
        double temperaturaFinal = (grados*9/5+32) + VALOR;
    }

    public void realizarOperaciones() {
        double resultado = grados * VALOR + grados + 1;
    }

    public void calcularRopa() {
        if (grados < TEMPERATURA_ALTA) {
            System.out.println("Utilizar ropa ligera. ");
        } else if (grados < TEMPERATURA_BAJA) {
            System.out.println("Abrigarse. ");
        } else {
            System.out.println("Utilizar ropa entretiempo. ");
        }
    }
}
