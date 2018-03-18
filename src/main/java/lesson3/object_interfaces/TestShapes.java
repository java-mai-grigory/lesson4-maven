package lesson3.object_interfaces;

import java.util.ArrayList;


public class TestShapes {

	public static void main(String[] args) {
		
            Circle c = new Circle(0, 0, 1);
	     Point p = new Point(0, 0);
	                

	        ArrayList<Drawable> list = new ArrayList<Drawable>(); //Преобразовал объект к нужной функциональности
	        list.add(c);
	        list.add(p);
	       
	        for(Drawable sh: list)
	        {
	        	sh.draw();
	        	System.out.println("");
	        }

	}

}
