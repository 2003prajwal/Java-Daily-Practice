abstract class hospital{
abstract void emergency();
abstract void appointment();
abstract void admit();
abstract void billing();

}
class myHospital extends hospital{
    @Override
    void emergency(){
        System.out.println("Take First Emergency Patient");
    }
    @Override
    void appointment(){
        System.out.println("Make call for appointment");
    }
    @Override
    void admit(){
        System.out.println("Serious Patient must be admit");
    }
    @Override
    void billing(){
        System.out.println("Before discharge make bill");
    }
}
class Hospitals {
    public static void main(String[] args) {
        hospital h = new  myHospital();
        h.emergency();
        h.appointment();
        h.admit();
        h.billing();
    }
}
