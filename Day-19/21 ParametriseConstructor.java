class Parametrise{
    private  int rollNo;
    private  String name;

     Parametrise(int rollNo, String name){
        this.rollNo=rollNo;
        this.name=name;
    }
    void display(){
        System.out.println("Roll No: "+rollNo+" & Name: "+name);
    }
}
 class ParametriseConstructor {
    public static void main(String[] args) {
        Parametrise P = new Parametrise(32,"Prajwal");
        P.display();
    }
}
