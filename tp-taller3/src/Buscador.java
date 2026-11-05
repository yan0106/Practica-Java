import java.io.File;

public class Buscador implements Runnable {
    private File directorio;
    private String nombreArchivo;

    public Buscador (File directorio, String nombreArchivo){
        this.directorio = directorio;
        this.nombreArchivo = nombreArchivo;
    }

    @Override
    public void run() {
        File f [] = directorio.listFiles();

        if (f != null) {
            for (File file : f) {
                if (file.isFile()){
                    String nameFile = file.getName();
                    if (nameFile.equals(nombreArchivo)){
                        System.out.println("Encontrado " + nombreArchivo + " en la ruta: " + file.getAbsolutePath());
                    }
                } else if (file.isDirectory()) {
                    Buscador b = new Buscador(file, nombreArchivo);
                    Thread t1 = new Thread(b);
                    t1.start();
                }
            }
        }

    }
}