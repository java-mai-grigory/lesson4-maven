package lesson3.object;

public abstract class Shape {
    private  String id;

    public abstract void move(int dx, int dy);
    public abstract void draw();
    public abstract int compareTo(Object o);
    public abstract boolean equals(Object o);

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
