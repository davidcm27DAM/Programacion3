package ejercicio1;

public class Coche {

    final static double IVA = 0.21;
    private String marca;
    private int baseImponible;

    public Coche(String nombreMarca, int precioSinIva) {
        setMarca(nombreMarca);
        setBaseImponible(precioSinIva);
    }

    public Coche() {
        marca = null;
        baseImponible = 0;
    }

    public static String arrancarCoche() {
        return "Girar la llave ";
    }

    public static String meterMarcha() {
        return "Introduce la primera marcha ";
    }

    public static String acelerarCoche() {
        return "Pulsa el acelerador";
    }

    public static String empezarConducir() {
        return "Pasos para arrancar el coche: \n1." +
                arrancarCoche() + "\n2." + meterMarcha() + "\n3." + acelerarCoche() + "\n";
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca.isEmpty()) {
            throw new IllegalArgumentException();
        } else {
            this.marca = marca;
        }

    }

    public int getBaseImponible() {
        return baseImponible;
    }

    public void setBaseImponible(int baseImponible) {

        this.baseImponible = baseImponible;
    }

    @Override
    public String toString() {
        return "Marca: " + getMarca() + "\n" +
                "Precio sin IVA: " + getBaseImponible() + "\n" +
                "Precio final: " + calcularPrecioIva() + "\n"
                + Coche.empezarConducir();
    }

    public double calcularPrecioIva() {
        return getBaseImponible() + getBaseImponible() * IVA;
    }

}
