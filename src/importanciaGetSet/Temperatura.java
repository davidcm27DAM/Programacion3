package importanciaGetSet;

public class Temperatura {

    private double grados;

    public Temperatura() {
        grados = 0;
    }

    public Temperatura(double grados) {
        this.grados = grados;
    }

    public double getGrados(){
        return grados;
    }
    public void visualizar(){
        System.out.println("La temperatura de hoy es: "+grados);
    }

    public void subirTemperatura(){
        double temperaturaFinal=grados+5;
    }

    public void realizarOperaciones(){
        double resultado=grados*5+grados+1;
    }
}
