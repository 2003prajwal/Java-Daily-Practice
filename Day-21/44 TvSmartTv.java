class Tv{
    public void switchOn(){
        System.out.println("Tv Switch On");
    }
    public void changeChannel(){
        System.out.println("Tv Change Channel");
    }
}
class SmartTv extends Tv{
    @Override
    public void switchOn(){
        System.out.println("Smart Tv Switch On");
    }
    @Override
    public void changeChannel(){
        System.out.println("Smart Tv Change Channel");
    }
    public void browse(){
        System.out.println("Smart tv Browsing");
    }
}
class TvSmartTv {
    public static void main(String[] args) {
        //Parent Class
        Tv t = new Tv();
        t.changeChannel();
        t.switchOn();
        System.out.println("==============");

        //Child Class
        SmartTv T = new SmartTv();
        T.switchOn();
        T.changeChannel();
        T.browse();
        System.out.println("==============");


        //Dynamic Method Dispatch
        Tv tt = new SmartTv();
        tt.switchOn();
        tt.changeChannel();

    }
}
