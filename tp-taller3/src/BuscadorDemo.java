import java.io.File;

public class BuscadorDemo {
    public static void main(String[] args) {
        File f1 = new File("./tp-taller3/entorno-prueba");
        GestorHilos gestorH = new GestorHilos();

        Buscador b = new Buscador(f1, "hola.txt", gestorH);
        Thread t1 = new Thread(b);
        if (f1.exists()) {
            t1.start();
        } else {
            System.out.println("No se encontró la ruta");
        }
    }
}
