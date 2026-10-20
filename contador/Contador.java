/*El objetivo es ver cómo interactúan dos hilos distintos modificando el mismo recurso 
compartido (Contador) al mismo tiempo, y comprobar que gracias a synchronized en inc() 
y dec() no haya condición de carrera (race condition). Al final, si uno suma 2000 y el 
otro resta 2000, el resultado final debería ser 0 */

package contador;

public class Contador {
    private int value;
    public synchronized void  inc () {
        value++;
    }
    public synchronized void dec () {
        value--;
    }
    public int getValue () {
        return value;
    }
}
