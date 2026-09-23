package pila;
import java.util.ArrayList;

public class Pila  {
    private ArrayList<Integer> elems = new ArrayList<>();
    public boolean contains (Integer nro){
        return elems.contains(nro);
    }

    public Integer pop (){
        Integer ult = elems.get(elems.size() - 1);
        elems.remove(elems.size() - 1);
        return ult;
    }

    public Integer push(Integer nro){
        elems.add(nro);
        return nro;
    }

    public int size (){
        return elems.size();
    }

}
