package lesson3.object_interfaces;

import java.util.Scanner;

import lesson3.exceptions.SyntaxException;

public class Point extends Shape implements Comparable{
    protected int x, y;

    Scanner s = new Scanner(System.in);
    
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
;
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setXFromIO() // Небезопасная инициализация интерактивным вводом!!!
    {
 
    	Scanner scaner = new Scanner(System.in);
    	String str = scaner.next();
    	try
    	{
     		this.x = Integer.valueOf(str); 
    	}
    	catch(NumberFormatException e)
    	{
    		System.out.println("Warning: wrong format");
    		e.printStackTrace();
    	}
    	finally
    	{
    		scaner.close();
    	}
   	
    }
    
    public void setYFromIO() // Небезопасная инициализация интерактивным вводом!!! Перенаправить ошибку
    {
    	Scanner scaner = new Scanner(System.in);
    	String str = scaner.next();
    	try
    	{
     		this.x = Integer.valueOf(str); 
    	}
    	catch(NumberFormatException e)
    	{
    		throw new NumberFormatException(); 
    	}
    	finally
    	{
    		scaner.close();
    	}

    }
 
    
    public void setY(String str) throws NumberFormatException // Небезопасная инициализация строкой!!!
    {
    	this.y = Integer.valueOf(str); 
    }
    
    public void setX(String str) throws NumberFormatException // Небезопасная инициализация строкой!!!
    {
    	try
    	{
    		this.x = Integer.valueOf(str);
    	}
    	catch(NumberFormatException e)
    	{
    		System.out.println("Warning: wrong format");
    		//e.printStackTrace();
    	}
    }
    
    public Point(String str) throws SyntaxException, NumberFormatException
    {
        int l = str.indexOf('(');
        int r = str.indexOf(')');
        int m = str.indexOf(',');
        if (l < 0 || r < 0 || m < 0)
            throw new SyntaxException();
        x = Integer.valueOf( str.substring(l + 1, m));
        y = Integer.valueOf( str.substring( m + 1, r));
        
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        s.close();                     // Хорошо закрывать ресурсные объекты
        System.out.println("Объект умер");
    }

    @Override
    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public void move_and_draw(int dx, int dy) {
        move(dx, dy);
        draw();     // В Java все методы виртуальные
    }

    @Override
    public void draw() {
        System.out.printf("(%d, %d)\n", x, y);
    }

    @Override
    public int compareTo(Object o) {
        Point other = (Point) o;             // Нельзя присвоить вышестоящему в иерархии нижестоящий
        if (this.distance_from_origin() > other.distance_from_origin()) return 1;
        else if (this.distance_from_origin() > other.distance_from_origin()) return -1;
        else return 0;

    }

    public void setY(int y) {
        this.y = y;
    }

    //Индивидуальный метод
    public double distance_from_origin() {
        return Math.sqrt(x * x + y * y);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point)) return false;
        Point point = (Point) o;
        return x == point.x &&
                y == point.y;
    }
	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}
    
    
}
