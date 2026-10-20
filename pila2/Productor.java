package pila2;

public class Productor extends Thread {
    private Pila2 pila;

    public Productor(Pila2 pila) {
        this.pila = pila;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) { // Producimos 20 elementos para probar
            char tmp = (char) ('A' + (Math.random() * 26));
            pila.push(tmp);
            System.out.println("Producido: " + tmp + " (Tamaño: " + pila.size() + ")");
            
            try {
                Thread.sleep(100 + (int) (Math.random() * 200));
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}