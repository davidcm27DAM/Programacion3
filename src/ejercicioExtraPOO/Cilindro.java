package ejercicioExtraPOO;

public class Cilindro {

    private int radio;
    private int altura;

    public Cilindro(int radio, int altura) {
        setRadio(radio);
        setAltura(altura);
    }

    public static void printVolumen(double volumen) {
        System.out.println("El volumen de tu cilindro es de " +
                volumen + " unidades. ");
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double calcularVolumen() {
        return (Math.PI * Math.pow(getRadio(), 2) * getAltura());
    }

}
