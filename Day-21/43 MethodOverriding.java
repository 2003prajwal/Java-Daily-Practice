class Super{
    public void display(){
        System.out.println("Super Class Display");
    }
}
class Sub extends Super{
@Override
    public void display(){
        System.out.println("Sub Class Display");
    }
}
class MethodOverriding {
    public static void main(String[] args) {
        Super s =new Super();
        s.display();

        Sub S = new Sub();
        S.display();

        //Dynamic method Dispatch
        Super ss =new  Sub();
        ss.display();
    }
}
