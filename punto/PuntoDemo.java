package punto;

public class PuntoDemo {
    public static void main(String[] args) {
        Punto r = new Punto(2, 4);
        Punto q = new Punto(2, 6);

        double d = r.Distancia(q);

        System.out.println(d);
    }
}
