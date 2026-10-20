package contador;

public class ContadorDemo {
    public static void main(String[] args) {
        Contador c = new Contador();

        // Hilo 1: Incrementa 2000 veces
        Thread h1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 2000; i++) {
                    c.inc();
                }
            }
        });

        // Hilo 2: Decrementa 2000 veces
        Thread h2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 2000; i++) {
                    c.dec();
                }
            }
        });

        // Arrancamos ambos hilos
        h1.start();
        h2.start();

        // Esperamos a que ambos hilos terminen antes de imprimir
        try {
            h1.join();
            h2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        // Mostramos el resultado final
        System.out.println("Resultado final del contador: " + c.getValue());
    }
}