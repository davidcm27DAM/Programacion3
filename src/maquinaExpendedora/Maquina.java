package maquinaExpendedora;

public class Maquina {

    private final int PRECIO_PRODUCTO = 90;
    private String producto;
    private int stock;
    private int monedero;
    private int ganancias;

    public Maquina(String producto, int stock) {
        this.producto = producto;
        this.stock = stock;
        this.monedero = 0;
        this.ganancias = 0;
    }

    public int getPRECIO_PRODUCTO() {
        return PRECIO_PRODUCTO;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getMonedero() {
        return monedero;
    }

    public void setMonedero(int monedero) {
        this.monedero = monedero;
    }

    public int getGanancias() {
        return ganancias;
    }

    public void setGanancias(int ganancias) {
        this.ganancias = ganancias;
    }

    @Override
    public String toString() {
        return "Maquina{" +
                "precioPaquete=" + PRECIO_PRODUCTO +
                ", producto='" + producto + '\'' +
                ", stock=" + stock +
                ", monedero=" + monedero +
                ", ganancias=" + ganancias +
                '}';
    }

    public void tragarMoneda(int valorMoneda){
        System.out.println("Introduzca una moneda de 10, 20 o 50 céntimos: ");
        while (monedero < PRECIO_PRODUCTO){

        }
    }
}
