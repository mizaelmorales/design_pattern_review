package GIT.Patrones.Creacionales.Factory.FactoryMethod;

public class HTLMButton implements Button {

    public void render(){
        System.out.println("Render HTML button");
    }

    public void onClick(){
        System.out.println("Click HTML button");
    }
    
}
