package clases_internas;

public class OuterLocal {
    public void m1(boolean condicion) {
        if (condicion) {
            // La clase solo se define y es visible dentro de este bloque if
            class Inner {
                public void v() {
                    System.out.println("Clase local dentro del if ejecutada");
                }
            }
            
            // La instanciación debe hacerse dentro del mismo bloque
            Inner i = new Inner();
            i.v();
        }
        
        // Fuera del if, 'Inner' no existe para el compilador
    }
}