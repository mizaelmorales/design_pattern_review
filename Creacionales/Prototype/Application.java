package GIT.Patrones.Creacionales.Prototype;

import java.util.ArrayList;

public class Application {

    ArrayList<Shape> shapes;

    Application(){
        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 40;
        shapes.add(circle);
        Circle anotherCircle = (Circle) circle.Clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 50;
        rectangle.height = 50;
        shapes.add(rectangle);
    }

    public void businessLogic() {
        ArrayList<Shape> shapescopy = new ArrayList<Shape>(); 
        for (Shape shape : shapes) {
            shapescopy.add(shape);
        }
    }

}
