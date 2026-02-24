class Parent{
    Parent(){
        System.out.println("Parent Class Constructor");
    }
}

class Child extends  Parent{
    Child(){
        System.out.println("Parent Class Constructor");
    }
}
class GrandChild extends Child{
    GrandChild(){
        System.out.println("GrandChild Constructor");
    }
}
class ConstructorInInheritance {
    public static void main(String[] args) {
        GrandChild g = new GrandChild();
    }
}
