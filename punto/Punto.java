package punto;

public class Punto {
    private int x;
    private int y;
    
    public Punto (boolean b) {
        x = 3;
        y = 2;
    }
    public Punto (int z, int p) { // constructor
        x = z;
        y = p;
    }
    public Punto () { // contructor random
        int d = (int) (10 * Math.random());
        int t = (int) (10 * Math.random());
        x = d;
        y = t;
    }

    public double Distancia (Punto a) {
        double dist = Math.sqrt (Math.pow ((a.x - x),2) + Math.pow((a.y - y), 2));
        return dist;
    }
  
}
