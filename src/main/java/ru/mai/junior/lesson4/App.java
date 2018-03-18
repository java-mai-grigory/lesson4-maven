package ru.mai.junior.lesson4;

import java.util.ArrayList;

import lesson3.object_interfaces.Circle;
import lesson3.object_interfaces.Drawable;
import lesson3.object_interfaces.Point;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Point p = new Point(3, 5);
        
      //  p.draw();
        Circle c = new Circle(p, 5);
      //  c.move_and_draw(10, 10);
        
        ArrayList arr = new ArrayList();
        arr.add(p);
        arr.add(c);
        
        
        Object o = arr.get(1);
        
        ((Drawable)o).draw();
    }
}
