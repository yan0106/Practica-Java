package pila2;

public class Consumidor extends Thread {
    private Pila2 pila;

    public Consumidor(Pila2 pila) {
        this.pila = pila;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            char tmp = pila.pop();
            System.out.println("Consumido: " + tmp + " (Tamaño: " + pila.size() + ")");
            
            try {
                Thread.sleep(150 + (int) (Math.random() * 200));
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}