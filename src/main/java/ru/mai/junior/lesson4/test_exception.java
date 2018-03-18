package ru.mai.junior.lesson4;

import lesson3.exceptions.InvalidShape;
import lesson3.exceptions.SyntaxException;
import lesson3.object_interfaces.Ring;
import lesson3.object_interfaces.Point;

public class test_exception {
	public static void main( String[] args )
    {
        Point p = new Point(1, 1);
       // p.setX("6a");
       
      //  p.setYFromIO();
        
       System.out.println(p);
    	Point pp = null;
        try
        {
        	pp = new Point("1,1)"); 
        }
        catch(SyntaxException | NumberFormatException e )
        {
        	System.out.println("Что-то не так ввели");
        }
        System.out.println(pp);
        
        Ring ring = null;
        try {
			ring = new Ring(0, 0, 5, 12);
		} catch (InvalidShape e) {
			
			System.out.println("Неправильная фигура");
		}
        
        ring.draw();
    };
}
