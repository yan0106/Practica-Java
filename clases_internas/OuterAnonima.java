package clases_internas;

// Define la clase en el momento en que le paso los argumentos a un método.

public class OuterAnonima {

    // Interfaz que servirá para la instanciación anónima
    interface MiInter {
        void print();
    }

    public void m1() {
        // Se define e instancia la clase anónima "al vuelo" como argumento
        m2(new MiInter() {
            @Override
            public void print() {
                System.out.println("Hola");
            }
        });
    }

    private void m2(MiInter mi) {
        mi.print();
    }

    public static void main(String[] args) {
        OuterAnonima oa = new OuterAnonima();
        oa.m1();
    }
}
