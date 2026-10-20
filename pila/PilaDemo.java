package pila;

public class PilaDemo {
    public static void main(String[] args) {
        Pila pila1 = new PilaNoDuplicada();

        for (int i = 0; i <= 10; i++) {
            try {
                pila1.push(i);
            } catch (ElementoDuplicadoException e) {
                System.out.println("Error por duplicado: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Excepción: " + e.getMessage());
            }
        }

        System.out.println("Tamano: " + pila1.size());

        for (int i = 0; i < 10; i++) {
            try {
                pila1.pop();
                System.out.println("Despues de pop:" + pila1.size());
            } catch (Exception e) {
                System.out.println("Excepción: " + e.getMessage());
            }
        }

    }
}
