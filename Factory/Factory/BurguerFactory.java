public class BurguerFactory {
    
    public Burguer createCheeseBurger() {
        String[] ingredients = { "bun", "cheese", "beef-patty" };
        return new Burguer(ingredients);
    }
    
    public Burguer createDeluxeCheeseBurger() {
        String[] ingredients = { "bun", "tomatoe", "lettuce", "cheese", "beef-patty" };
        return new Burguer(ingredients);
    }

}
