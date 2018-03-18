package lesson3.object;

import java.util.ArrayList;

public class TestShapes {
    public static void main(String[] args)
    {
        int  size = 10000000;
        Point lostPoint;
       //Point[] p = new Point[size];
        Point p;
       /* for(int i = 0; i < size; i++)
            p = new Point(0, 0);*/
        
        p = new Point(0, 0);
        Circle c = new Circle(0, 0, 6);
        Object o;
        
        o = p;
        
        ArrayList<Object> list = new ArrayList();
        list.add(p);
        list.add(c);
        
        Object o1 =list.get(0);
        
        if (o1 instanceof Point )
        	p = (Point)o1;
        p.draw();
        
     }
}
