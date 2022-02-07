public class Punto2DCartesiano implements Punto2D 
{
    private double x;
    private double y;

    public Punto2DCartesiano(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public double getX() {return x; }
    public double getY() {return y; }

    public double distancia(Punto2D q)
    {
        return Math.sqrt(
            (getX()-q.getX())*(getX()-q.getX()) + (getY()-q.getY())*(getY()-q.getY()) 
        );
    }

    public static void main(String[] args) {
        Punto2D p1 = new Punto2DCartesiano(0, 1);
        assert(p1.getX()==0.0);
        assert(p2.getY()==1.0);

        Punto2D p2 = new Punto2DCartesiano(7, 1);
        assert(p2.getX()==7.0);
        assert(p2.getY()==3.0);

        assert(p1.distancia(p2)==7.0);
        assert(p2.distancia(p1)==7.0);
    }
  
  
}
