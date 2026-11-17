package poo;

public class Principal {
    /*
     * Declaración de objetos. Los objetos aún no existen.
     * Cuando el tipo de datos de una variable es el nombre de
     * una clase esa variable es un puntero, es decir,
     * su valor va a ser una dirección de memoria y no se
     * puede introducir desde el teclado.
     */
    Rectangulo rect1;
    Rectangulo rect2;

    public Principal() {
        /*
         * El new nos permite instanciar o crear un objeto asignándole memoria para los miembros
         * de la clase, es decir, para los atributos y métodos que están definidos e implementados
         * en la clase.
         * El new devuelve la dirección de memoria donde está almacenado ese objeto.
         * Esta dirección la recoge la variable definida, en este caso rect1 y rect2. Po tanto,
         * rect1 y rect2 son punteros que apuntan a diferentes objetos de la clase Rectangulo.
         * Por otro lado se invoca al constructor que hemos definido.
         */
        rect1 = new Rectangulo();
        rect2 = new Rectangulo(4, 8);
    }

    static void main(String[] args) {

        Principal p1 = new Principal();
        p1.run();

    }

    public void run() {
        /*
        * Los métodos de instancia (sin el modificador static) se invocan mediante la referencia
        * o dirección de memoria del objeto.
         */

        rect1.setBase(2);
        rect1.setAltura(6);
        System.out.println("Área del rectángulo 2 de altura " + rect2.getAltura()
                + " y de base " + rect2.getBase() + " es " + rect2.calcularArea());
        System.out.println(rect1.toString());
        Rectangulo.contarObjetos();


    }

}
