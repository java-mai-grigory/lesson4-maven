package lesson3.object_interfaces;

public abstract class Shape implements Movable,Drawable {

	@Override
	public abstract void draw();

	@Override
	public abstract void move(int dx, int dy) ;

	

}
