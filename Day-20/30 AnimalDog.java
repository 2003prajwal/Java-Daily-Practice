//Parent Class, Super Class
class Animal{
    public void eat(){
        System.out.println("Animal Is Eating");
    }
}

//Child Class, Sub Class
class Dog extends  Animal{
    public void barking(){
        System.out.println("Dog Barking");
    }
}
class AnimalDog {
    public static void main(String[] args) {
        System.out.println("(Parent Class)");
        Animal A = new Animal();
        A.eat();

        System.out.println();

        System.out.println("(Child Class)");
        Dog D = new Dog();
        D.eat();
        D.barking();
    }
}
