public class GestorHilos {
    private int hilosActivos = 1;
    private final int MAX_HILOS = 10; 

    public synchronized void solicitarPermiso() {
        while (hilosActivos >= MAX_HILOS) {
            try {
                
            } catch (Exception e) {
                // TODO: handle exception
            }
            
        }
        hilosActivos++;
    }

    public synchronized void liberarPermiso(){
        
    }
}
