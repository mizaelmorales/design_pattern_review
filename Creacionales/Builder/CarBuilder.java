package GIT.Patrones.Creacionales.Builder;

public class CarBuilder implements Builder {
    
    private Car car;
    private Car product;
    
    CarBuilder(){
        this.reset();
    }

    public void reset(){
        this.car = new Car();
    }

    public void setSeats(){

    }

    public void setEngine(){

    }

    public void setGPS(){

    }

    public void setTripComputer(){

    }

    public Car getProduct(){
        product = this.car;
        this.reset();
        return product;
    }
}
