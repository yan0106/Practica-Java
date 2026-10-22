package clases_internas;

public class OuterMiembro {
    public class Inner {
        public void m1 () {

        }
    }

    public static void main(String[] args) {
        // Primero instanciar la clase contenedora
        OuterMiembro o = new OuterMiembro();
        // Recién ahí se puede instanciar la clase interna usando el objeto contenedor (o.new Inner())
        OuterMiembro.Inner oi = o.new Inner();
        oi.m1();
    }
}
