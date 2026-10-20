/* qué pasa cuando se agota la memoria del sistema y cómo Java lo maneja mediante una 
excepción/error. */
/* en Java se pueden atrapar no solo las excepciones comunes, sino también los errores 
graves de la JVM provocados por mala gestión de memoria */

package exception;

import java.util.*;

public class Basura {
    private String nombre;
    private int id;

    // Constructor para poder instanciar con los parámetros ("Hola", i)
    public Basura(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public static void main(String[] args) {
        System.out.println("Inicio del programa");

        try {
            // Ejemplo 1: Objeto que SI se vuelve candidato para el GC
            for (int i = 0; i < 10000; i++) {
                // 'b' vive únicamente en esta vuelta del ciclo.
                // En la siguiente iteración, el objeto anterior pierde su referencia.
                Basura b = new Basura("Hola" + i, i);
            }

            // Sugerencia a la JVM para liberar la memoria de los objetos no alcanzables
            System.gc();

            // Ejemplo 2: Objeto que NO se vuelve candidato para el GC
            List<Basura> lista = new ArrayList<>();
            for (int i = 0; i < 10000; i++) {
                Basura b = new Basura("Guardado" + i, i);
                lista.add(b); // Al guardarlo en la lista, SIGUE alcanzable.
            }

        } catch (Throwable e) {
            System.out.println("Ups! Ocurrió un error: " + e.getMessage());
        }

        System.out.println("Fin del programa");
    }
}