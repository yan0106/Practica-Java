package pila;

public class PilaNoDuplicada extends Pila{
    @Override
    public Integer push (Integer nro) throws Exception {
        if(contains(nro)){
            throw new ElementoDuplicadoException("El elemento " + nro + " ya existe en la pila.");
        }
        return super.push(nro);
    }

}