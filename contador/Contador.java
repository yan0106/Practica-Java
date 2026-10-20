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
