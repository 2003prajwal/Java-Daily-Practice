class pparent {
    pparent(){
        System.out.println("Non Parametrise of parent");
    }
    pparent(int x){
        System.out.println("Parametrise of parent"+"( for understanding = "+x+")");
    }
}
class hildse extends pparent {
    hildse(){
        System.out.println("Non Parametrise of Child");
    }
    hildse(int y){
        System.out.println("Parametrise of Child");
    }
    hildse(int x, int y){
        // here we sending x to parent constructor
        super(x);
        System.out.println("2 Parametrise " +"( for understanding = "+y+")");
    }
}
class ParametriseConstructorInInheritance {
    public static void main(String[] args) {
        hildse c = new hildse(6,7);
    }
}
