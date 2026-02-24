class Vehicles {
    String brand = "Toyota";

   public void Start() {
        System.out.println("Brand: " + brand);
    }
}

class Car extends Vehicles {
    String fuelType="Petrol";

    void showCarDetails(){
        Start();
        System.out.println("Fuel Type: "+fuelType);
    }
}
class VehicleCar {
    public static void main(String[] args) {
        Car c = new Car();
        c.showCarDetails();
    }
}
