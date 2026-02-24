class vehicle {
    String brand;
    long year;

    vehicle(String brand, long year){
        this.brand=brand;
        this.year=year;
    }
}

class arr extends vehicle{
    String model;

   public arr(String brand, long year, String model){
        super(brand,year);
        this.model=model;
    }
    public void display(){
        System.out.println("Brand: "+brand);
        System.out.println("Year: "+year);
        System.out.println("Model: "+model);
    }
}

class Vehiclecarr {
    public static void main(String[] args) {
        arr C = new arr("Toyota", 2020,"Safari");
       C.display();
    }
}
