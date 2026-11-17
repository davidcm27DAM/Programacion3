package ejercicio1;

public class Coche {

    String marca;
    int baseImponible;

    public Coche(String nombreMarca, int precioSinIva){
        marca = nombreMarca;
        baseImponible = precioSinIva;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getBaseImponible() {
        return baseImponible;
    }

    public void setBaseImponible(int baseImponible) {
        this.baseImponible = baseImponible;
    }

    @Override
    public String toString() {
        return "Marca: "+ marca +"\n" +
                "Precio sin IVA: "+ baseImponible+ "\n" +
                "Pasos para arrancar el coche: \n1."+
                arrancarCoche() + "\n2."+ meterMarcha() + "\n3."+ acelerarCoche() + "\n" +
                "Precio final: "+ (baseImponible + (baseImponible*0.21));
    }

    public String arrancarCoche(){
        return "Girar la llave ";
    }

    public String meterMarcha(){
        return "Introduce la primera marcha ";
    }

    public String acelerarCoche(){
        return "Pulsa el acelerador";
    }
}
