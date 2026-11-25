package ejercicioExtraPOO;

public class Esfera {
    private int radio;

    public Esfera(int radio) {
        setRadio(radio);
    }

    public static void printVolumen(double volumen) {
        System.out.println("El volumen de tu esfera es de " +
                volumen + " unidades. ");
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public double calcularVolumen() {
        return (4.0 / 3 * Math.PI * Math.pow(getRadio(), 3));
    }

}
