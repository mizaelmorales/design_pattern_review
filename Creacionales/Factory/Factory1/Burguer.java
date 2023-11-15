package GIT.Patrones.Creacionales.Factory.Factory1;

public class Burguer {
    private String[] ingredients;

    public Burguer( String[] ingredients) {
        this.ingredients = ingredients;
    }

    public String[] getIngredients() {
        return this.ingredients;
    }

}
