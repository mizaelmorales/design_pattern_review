package GIT.Patrones.Creacionales.Prototype;

public class Circle extends Shape{
    protected int radius;
    
    Circle(){

    }

    Circle(Circle source){
        super(source);
        this.radius = source.radius;
    }

    public Shape Clone(){
        return new Circle(this);
    }
}
