package poo;

/*
 * Una clase es una plantilla para crear tantos objetos como queramos
 */

public class Rectangulo {
    /*
     * Los atributos son las características comunes que tiene un objeto.
     * A los atributos se les debe poder dar un valor.
     * Dejan de existir cuando el objeto deja de existir.
     * Los atributos que no tienen como modificador la palabra static se denominan
     * atributos de instancia, lo que significa que forman parte del objeto y, por tanto,
     * debemos tener creado un objeto.
     * Su ámbito de aplicación es toda la clase.
     */
    private int base;
    private int altura;
    /*
     * Los atributos que tienen el modificador static son atributos de clase.
     * Es común para todos los objetos y existe aunque no haya un objeto creado.
     */
    private static int contador; // cuenta el total de rectángulos creados

    /*
     * Los métodos indican las acciones que se puede llevar a cabo con un objeto.
     * Los métodos que llevan el modificador static son métodos de clase.
     * Su implementación es igual para todos los objetos. No pueden hacer referencia
     * a los atributos de instancia de un objeto, solo a los de clase, ni tampoco pueden
     * invocar a otros métodos de instancia, ya que tanto los atributos como métodos
     * de instancia identifican a los objetos.
     */

    /*
     * Los constructores son una especie de métodos del cual no se especifica retorno
     * coincidiendo su nombre con el de la clase donde están definidos.
     * Su función es construir el objeto, inicializando sus atributos.
     * Los constructores pueden tener parámetros.
     */
    /*
     * Si no se ha implementado ningún constructor el compilador crea uno por defecto,
     * es decir, sin parámetros ni cuerpo, inicializando los atributos a sus valores
     * por defecto.
     * Si implementamos en el programa fuente al menos un constructor Java no incluye
     * el constructor por defecto.
     */
    /*
    * Puede haber sobrecarga de métodos (que tengan el mismo nombre) en una clase,
    * pero deben diferenciarse por sus parámetros (por su número, su tipo o
    * posición que ocupen). De esta forma el compilador no dará error ya que los
    * distingue perfectamente.
    * El tipo devuelto por el método no se tiene en cuenta para la sobrecarga.
     */
    public Rectangulo() {
        base = 0; // también sería posible setBase(0);
        altura = 0;
        contador++;
    }

    public Rectangulo(int base, int altura) {
        this.base = base; // o también setBase(base)
        this.altura = altura;
        contador++;
    }


    public static void contarObjetos() {
        System.out.println("Hemos creado " + contador + " rectángulos. ");
    }

    /*
     * Los métodos que no llevan el modificador static son métodos de instancia.
     * Esto significa que forman parte de un objeto y, por tanto, debemos tener creado
     * el objeto.
     */
    /*
     * Los métodos get devuelven el valor de un atributo.
     */

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    /*
     * Los métodos set nos permiten dar valor a modificar, si es que lo tienen dado,
     * el valor de un atributo, asignándole el valor del parámetro de entrada.
     */

    public void setBase(int base) {
        this.base = base;
        /*
         * Cuando el atributo se llama igual que el parámetro
         * debemos poner la palabra reservada "this" antes del nombre
         * del atributo, puesto que, si no, el parámetro oculta al
         * atributo y no podemos tener acceso a él.
         */

    }

    public void setAltura(int alt) {
        altura = Math.abs(alt); // controlamos que la altura sea siempre positiva.
    }

    /*
     * Método de propósito general, que calcula el área de un rectángulo
     */

    public int calcularArea() {
        return getBase() * getAltura();
    }

    /*
     * El método toString nos permite mostrar el valor de los atributos
     *       de un objeto, a través de una cadena de texto.
     */


    public String toString() {
        return "Rectángulo de base: " + getBase() + " y altura: " + getAltura();
    }


}
