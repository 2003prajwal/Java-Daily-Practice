class rec {
    int length;
    int breadth;

    rec() {
        length = breadth = 1;
    }

    rec(int l, int b) {
        length = l;
        breadth = b;
    }
}
class cuboid extends rec{
    int height;

    cuboid(){
       height = 1;
    }

    cuboid(int h){
        height = h;
    }
    cuboid(int l, int b, int h){
        super(l, b);
        height = h;
    }
    int volume(){
        return length*breadth*height;
    }

}
class ExParametriseConstructor {
    public static void main(String[] args) {
        cuboid c = new cuboid(1,3,10);
        System.out.println(c.volume());
    }
}