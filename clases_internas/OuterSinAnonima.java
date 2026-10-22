package clases_internas;

// El camino sin clase anónima: se creó una interfaz (MiInter), una clase concreta que la 
// implementa (MiClass), y en m1() se instanció new MiClass() para pasársela a m2().

public class OuterSinAnonima {
    public void m1 () {
        m2 (new MiClass());
    }

    private void m2 (MiInter mi) {
        mi.print();
    }

    public static void main(String[] args) {
        OuterSinAnonima oa = new OuterSinAnonima();
        oa.m1();
    }
}

interface MiInter {
    void print ();    
}

class MiClass implements MiInter {
    public void print () {
        System.out.println("Hola");
    }    
}