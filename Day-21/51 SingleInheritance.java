class apple{
    void fruit(){
        System.out.println("It is A Fruit");
    }
}
class mango extends apple{
    void nationalFruit(){
        System.out.println("It is a National Fruit");
    }
}
class SingleInheritance {
    public static void main(String[] args) {
        mango m = new mango();
        m.fruit();
        m.nationalFruit();
    }
}
