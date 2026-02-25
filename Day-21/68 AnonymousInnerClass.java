//Parent Class
class Anon{
    void show(){
        System.out.println("Parent");
    }
}
class AnonymousInnerClass {
    public static void main(String[] args) {

        Anon A = new Anon() {
            @Override
            void show() {
             super.show();
                System.out.println("Child");
            }
        };
        A.show();
    }
}

/*
This part creates the Child class:

new A() {
    void display() {
        System.out.println("Anonymous Child");
    }
}
*/