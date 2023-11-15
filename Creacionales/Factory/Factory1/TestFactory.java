package GIT.Patrones.Creacionales.Factory.Factory1;
import java.util.Arrays;
public class TestFactory {
    public static void main(String[] args) {
    BurguerFactory burgerFactory1 = new BurguerFactory();
    Burguer cheeseBurger = burgerFactory1.createCheeseBurger();
    System.out.println(Arrays.toString(cheeseBurger.getIngredients()));
    Burguer DeluxeCheeseBurger = burgerFactory1.createDeluxeCheeseBurger();
    System.out.println(Arrays.toString(DeluxeCheeseBurger.getIngredients()));
    }
}