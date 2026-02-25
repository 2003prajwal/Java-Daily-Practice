abstract class first {
    void animal(){
        System.out.println("Animal eat");
    }
    abstract void dog();
}
class second extends  first{
    @Override
    void dog (){
        System.out.println("Dog Barking");
    }
}
class AbstractClassMethod {
    public static void main(String[] args) {
        second B = new second();
        B.animal();
        B.dog();

        System.out.println();

        first A = new second();
        A.animal();
        A.dog();
    }
}
