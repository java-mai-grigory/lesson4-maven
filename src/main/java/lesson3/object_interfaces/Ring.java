package lesson3.object_interfaces;

import lesson3.exceptions.InvalidShape;

public class Ring extends Circle {
	protected int InnerR;

	public Ring(int x, int y, int r, int innerR) throws InvalidShape {
		super(x, y, r);
		if (r > InnerR)
			this.InnerR = innerR;
		else
			throw new InvalidShape();
	}
	
	
	 @Override
	    public void draw() {
	        System.out.printf( "x = %d; y = %d; r = %d, R = %d", x, y, r, InnerR);
	    }

	
	
}
