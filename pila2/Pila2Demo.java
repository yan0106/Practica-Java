package pila2;

public class Pila2Demo {
    public static void main(String[] args) {
        Pila2 pila = new Pila2();

        Productor productor = new Productor(pila);
        Consumidor consumidor = new Consumidor(pila);

        productor.start();
        consumidor.start();
    }
}
