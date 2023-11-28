public class Rectangle extends Shape {

    protected int width;
    protected int height;
    
    Rectangle(){

    }

    Rectangle(Rectangle source){
        super(source);
        this.width = source.width;
        this.height = source.height;
    }

    public Shape Clone(){
        return new Rectangle(this);
    }
}
