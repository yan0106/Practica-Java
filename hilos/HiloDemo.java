package hilos;

public class HiloDemo {
    public static void main(String[] args) {
        HiloPositivo hp = new HiloPositivo();
        hp.start();

        HiloNegativo hn = new HiloNegativo();
        Thread t1 = new Thread(hn);
        t1.start();

        try {
            hp.join();
            t1.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("hola");
    }
}
