public class CarManualBuilder {
        private Manual manual;
        private Manual product;

        CarManualBuilder(){
        this.reset();
    }

    public void reset(){
        this.manual = new Manual();
    }

    public void setSeats(){

    }

    public void setEngine(){

    }

    public void setGPS(){

    }

    public void setTripComputer(){

    }

    public Manual getProduct(){
        product = this.manual;
        this.reset();
        return product;
    }

}


