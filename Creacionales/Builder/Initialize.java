package GIT.Patrones.Creacionales.Builder;

public class Initialize {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.ConstructorSportCar(builder);
        Car car = builder.getProduct();
    }
}
