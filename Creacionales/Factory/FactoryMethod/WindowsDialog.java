package GIT.Patrones.Creacionales.Factory.FactoryMethod;

public class WindowsDialog extends Dialog {

    public Button createButton(){
        return new WindowsButton();
    }
    
}
