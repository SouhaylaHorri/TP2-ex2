
public class Point
{
    public int abs;
    public int ord;
    static int nombre;
    int numero;


    public Point(int abc, int ord)
    {
        this.abs = 0;
        this.ord = 0 ;
        ++nombre;
        ++numero;
    }

    void setCoordonneePoint(int u , int v)
    {
        abs=u;
        ord=v;
    }

    void Point (int u, int v)
    {
        this.abs=u;
        this.ord=v;
    }


    void translate(int u , int v)
    {
        abs=abs+u;
        ord=ord+v;

    }
    void affichePoint()
    {
        System.out.println("l'abcise de la point p est:"+this.abs);
        System.out.println("l'abcise de la point p est:"+this.ord);
    }
    public Point origine()
    {
        if((abs==0)&&(ord==0))
        {
            System.out.println("le coordonnee sont nulles");
        }
        else {
            System.out.println("le coordonnee sont non nulles");
        }
    }

    public boolean egale(Point q)
    {
        if((this.abs==q.abs)&&(this.ord==q.ord))
        {
            return true;
        }
        else {
            return false;
        }
        
    }

    public Point symetrie()
    {
        int a = -this.abs;
        int b=-this.ord;
        return new Point(a,b);
    }
    public int getNumero()
    {
         return numero;
    }
    public int getNombre()
    {
        return nombre;
    }


}
