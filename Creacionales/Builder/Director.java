public class Director {
    private Builder builder;

    public Builder setBuilder(Builder builder){
        return this.builder = builder;
    }

    public Builder ConstructorSportCar(Builder builder){
        this.builder = builder;
        this.builder.reset();
        this.builder.setSeats();
        this.builder.setEngine();
        this.builder.setTripComputer();
        this.builder.setGPS();
        return this.builder;
    }

}
