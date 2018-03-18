package lesson3.object;

import java.util.ArrayList;

public class PointTest {

    public static void main(String[] args)
    {
        Circle circle = new Circle(0, 0, 6);
      //  circle.move_and_draw(1, 1);
     //   System.out.println("");
        
        
        Circle c = new Circle(0, 0, 1);
        Point p = new Point(0, 0);
                

        ArrayList<Shape> list = new ArrayList<Shape>();
        list.add(c);
        list.add(p);
       
        for(Shape sh: list)
        {
        	sh.draw();
        	System.out.println("");
        }
    }

}
