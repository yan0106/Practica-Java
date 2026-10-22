package clases_internas;

public class OuterEstatica {

    public static class Inner {
        public void m1() {

        }
    }

    public static void main(String[] args) {
        // Al ser estática, se instancia directamente usando la clase contenedora
        // (OuterEstatica.Inner)
        OuterEstatica.Inner oi = new OuterEstatica.Inner();
        oi.m1();
    }
}
