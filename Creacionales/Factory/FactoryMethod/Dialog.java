package GIT.Patrones.Creacionales.Factory.FactoryMethod;

public abstract class Dialog {

    abstract Button createButton();

    public void render(){
        Button okButton = createButton();
        okButton.onClick();
        okButton.render();
    }
}
