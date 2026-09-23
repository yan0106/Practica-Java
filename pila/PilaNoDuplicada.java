package pila;

public class PilaNoDuplicada extends Pila{
    @Override
    public Integer push(Integer nro){
        if(contains(nro)){
            System.out.println("Elemento duplicado");
            return nro;
        }
        return super.push(nro);
    }

}