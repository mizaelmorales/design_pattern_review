package GIT.Patrones.Creacionales.Factory.FactoryMethod;

public class WindowsButton implements Button{

    public void render(){
        System.out.println("Render windows button");
    }

    public void onClick(){
        System.out.println("Click Windows button");
    }
    
}
