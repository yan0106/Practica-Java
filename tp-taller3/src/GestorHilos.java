public class GestorHilos {
    private int hilosActivos = 1;
    private final int MAX_HILOS = 10; 

    public synchronized void solicitarPermiso() {
        while (hilosActivos >= MAX_HILOS) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }            
        }
        hilosActivos++;
    }

    public synchronized void liberarPermiso(){
        hilosActivos--;
        notifyAll();
    }
}
