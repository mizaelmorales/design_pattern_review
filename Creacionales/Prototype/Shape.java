package GIT.Patrones.Creacionales.Prototype;

public abstract class Shape {
    protected int x;
    protected int y;
    protected String color;

    Shape(){
        
    }

    Shape(Shape source) {
        this.x = source.x;
        this.y = source.y;
        this.color =source.color;
    }

    abstract Shape Clone();

}
