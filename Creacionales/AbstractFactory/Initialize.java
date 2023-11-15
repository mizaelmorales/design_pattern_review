package GIT.Patrones.Creacionales.AbstractFactory;

import java.util.Scanner;


public class Initialize {
    public static void main(String[] args) {
        GUIFactory factory =null;
        Button button = null;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tipo de ambiente");

        String ambiente = scanner.nextLine();

        if(ambiente.equals("Windows")) {
            factory = new WinFactory();
        }else if(ambiente.equals("Mac")) {
            factory = new MacFactory();
        }
        else {
            System.out.println("Error");
        }

        button = factory.createButton();
        button.paint();
    }
}
