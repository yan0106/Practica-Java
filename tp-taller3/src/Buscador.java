import java.io.File;

public class Buscador implements Runnable {
    private File directorio;
    private String nombreArchivo;
    private GestorHilos gestorH;

    public Buscador(File directorio, String nombreArchivo, GestorHilos gestorH) {
        this.directorio = directorio;
        this.nombreArchivo = nombreArchivo;
        this.gestorH = gestorH;
    }

    @Override
    public void run() {
        try {
            File f[] = directorio.listFiles();

            if (f != null) {
                for (File file : f) {
                    if (file.isFile()) {
                        String nameFile = file.getName();
                        if (nameFile.equals(nombreArchivo)) {
                            System.out
                                    .println("Encontrado " + nombreArchivo + " en la ruta: " + file.getAbsolutePath());
                        }
                    } else if (file.isDirectory()) {
                        Buscador b = new Buscador(file, nombreArchivo, gestorH);
                        Thread t1 = new Thread(b);
                        gestorH.solicitarPermiso();
                        t1.start();
                    }
                }
            }
                
        } finally {
            gestorH.liberarPermiso();
        }
    }
}