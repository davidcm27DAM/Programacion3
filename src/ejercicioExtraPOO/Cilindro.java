package ejercicioExtraPOO;

public class Cilindro {

    private int radio;
    private int altura;

    public Cilindro(int radio, int altura){
        setRadio(radio);
        setAltura(altura);
    }

    public Cilindro(){
        radio = 0;
        altura = 0;
    }

    public void setRadio(int radio){
        this.radio = radio;
    }

    public void setAltura(int altura){
        this.altura = altura;
    }

    public int getRadio() {
        return radio;
    }

    public int getAltura() {
        return altura;
    }

    public double calcularVolumen(){
        return (Math.PI*Math.pow(getRadio(),2)*getAltura());
    }


}
