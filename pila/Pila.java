package pila;

import java.util.ArrayList;

public class Pila {
    private static final int maximo = 5; // no puede cambiar el valor
    private ArrayList<Integer> elems = new ArrayList<>();

    public boolean contains(Integer nro) {
        return elems.contains(nro);
    }

    public Integer pop() {
        if (elems.size() == 0) {
            throw new RuntimeException("Pila vacía");
        }
        Integer ult = elems.get(elems.size() - 1);
        elems.remove(elems.size() - 1);
        return ult;
    }

    public Integer push(Integer nro) throws Exception {
        if (elems.size() < maximo) {
            elems.add(nro);
            return nro;
        } else {
            throw new Exception("La pila está llena");
        }
    }

    public int size() {
        return elems.size();
    }

}
