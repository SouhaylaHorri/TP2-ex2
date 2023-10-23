public class testpoint {
    public static void main(String[]args)
    {
        Point p2=new Point(2,5);
        Point p1=new Point(3,4);
        Point q=new Point(-3,-4);
        q.affichePoint();
        p1.affichePoint();
        System.out.println("Est-ce-que la premiére point est a l,origine "+p1.origine());
        System.out.println("Est-ce-que les deux points p1 et q sont egeaux "+p1.egale(q));
        System.out.println("Est-ce-que le point ab est symetrie de point p1"+p1.symetrie());
        System.out.println("Nombre de points créé est : "+p1.getNombre());



    }



}
