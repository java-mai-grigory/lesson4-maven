package lesson3.object_interfaces;
 
public class Circle extends Point {
    protected int r;

    public Circle(int x, int y, int r) {
        super(x, y);
        this.r = r;
    }
    
    public Circle(Point p, int r) {
        super(p.x, p.y);
        
        this.r = r;
    }

    @Override
    public void draw() {
        System.out.printf( "x = %d; y = %d; r = %d", x, y, r);
    }

    //Площадь окружности
    public double square()
    {
        return Math.PI * r * r;
    }

    //Длина окружности
    public double length()
    {
        return 2 * Math.PI * r;
    }

    //Сравниваем площади
    public int compare(Circle other)
    {
        if (this.square() > other.square()) return 1;
        else if (this.square() < other.square()) return -1;
        else return 0;
    }

    public static int compare(Circle first, Circle second)   //Статический член
    {
        if (first.square() > second.square()) return 1;
        else if (first.square() < second.square()) return -1;
        else return 0;
    }

}
