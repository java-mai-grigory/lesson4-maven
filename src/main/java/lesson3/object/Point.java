package lesson3.object;

import java.util.Scanner;

public class Point extends Shape implements Comparable{
    protected int x, y;

    Scanner s = new Scanner(System.in);
    
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public Point(String s)
    {
    	
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }
    
    public void setX(String str_x) // Небезопасная инициализация строковой перменной !!!
    {
    	
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
}
