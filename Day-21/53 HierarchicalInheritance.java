class Bike{
    void petrol(){
        System.out.println("Required Petrol");
    }
}
class SportBike extends Bike{
    void fast(){
        System.out.println("Sport Bike Have More Pickup");
    }
}
class AdventureTourerBike extends Bike{
    void largeFuelTank(){
        System.out.println("Adventure Tourer Bike have large fuel tank");
    }
}
class HierarchicalInheritance {
    public static void main(String[] args) {
        AdventureTourerBike A = new AdventureTourerBike();
        A.petrol();
        A.largeFuelTank();
        System.out.println();

        SportBike s = new SportBike();
        s.petrol();
        s.fast();
    }
}
