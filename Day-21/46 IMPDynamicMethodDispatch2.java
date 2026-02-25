class AA{}
class BB extends AA{}

class x{
    public AA display(){
        System.out.println("Super Display");
        return new AA();
    }
}
class y extends x{
    @Override
    public BB display(){
        System.out.println("Sub Display");
        return new BB();
    }
}
class DynamicMethodDispatch2 {
    public static void main(String[] args) {

    }
}
//Java allows child class to change return type if:
//👉 The return type in child is a subclass of parent’s return type.