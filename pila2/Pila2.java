package pila2;

public class Pila2 {
    private int index = 0;
    private char[] elementos;

    public Pila2() {
        elementos = new char[4]; // Capacidad máxima de 4 elementos
    }

    // Productor: espera si la pila está llena
    public synchronized void push(char c) {
        while (index == elementos.length) {
            try {
                this.wait(); // Espera a que el Consumidor libere espacio
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        elementos[index++] = c;
        this.notifyAll(); // Avisa que hay un elemento disponible
    }

    // Consumidor: espera si la pila está vacía
    public synchronized char pop() {
        while (index == 0) {
            try {
                this.wait(); // Espera a que el Productor agregue un elemento
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        char c = elementos[--index];
        this.notifyAll(); // Avisa que se liberó un lugar en la pila
        return c;
    }

    public synchronized int size() {
        return index;
    }
}