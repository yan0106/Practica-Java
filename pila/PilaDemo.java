package pila;

public class PilaDemo {
    public static void main(String[] args) {
        Pila pila1 = new PilaNoDuplicada();

        pila1.push(2);
        pila1.push(3);
        pila1.push(4);
        pila1.push(2);
        System.out.println("Tamano: " + pila1.size());
        
        
        pila1.pop();
        System.out.println("\nDespues de pop:" + pila1.size());

        
    }
}
