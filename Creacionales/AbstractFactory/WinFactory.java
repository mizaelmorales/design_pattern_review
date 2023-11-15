package GIT.Patrones.Creacionales.AbstractFactory;

public class WinFactory implements GUIFactory {
    public Button createButton(){
        return new WinButton();
    }
    public CheckBox createCheckbox() {
        return new WinCheckbox();
    }
}
