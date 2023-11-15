package GIT.Patrones.Creacionales.Factory.FactoryMethod;

public class WebDialog extends Dialog {
    public Button createButton(){
        return new HTLMButton();
    }
    
}
