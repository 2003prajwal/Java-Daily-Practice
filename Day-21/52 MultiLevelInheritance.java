class AAnimal{
    void eat(){
        System.out.println("Animal eats");
    }
}
class DDog extends AAnimal{
    void bark(){
        System.out.println("Dog Barking");
    }
}
class Puppy extends DDog{
    void weep(){
        System.out.println("Puppy Weeps");
    }
}
class MultiLevelInheritance {
    public static void main(String[] args) {
        Puppy P = new Puppy();
        P.eat();
        P.bark();
        P.weep();
    }
}
