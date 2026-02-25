class phone{
    public void call(){
        System.out.println("Phone Call");
    }
    public void sms(){
        System.out.println("Phone Sending Sms");
    }
}
interface ICamera{
    void click();
    void record();
}
interface IMusicPlayer{
    void play();
    void stop();
}
class SmartPhone extends phone implements IMusicPlayer,ICamera{

    public void videoCall(){
        System.out.println("Smart Phone Video Calling");
    }
    @Override
    public void click(){
        System.out.println("Smart Phone Clicking Photo");
    }
    @Override
    public void record(){
        System.out.println("Smart Phone Recording Video");
    }
    @Override
    public void play(){
        System.out.println("Smart Phone Playing Music");
    }
    @Override
    public void stop(){
        System.out.println("Smart Phone stopped playing music");
    }
    @Override
    public void call(){
        System.out.println("Smart Phone make a call");
    }
    @Override
    public void sms(){
        System.out.println("Smart Phone make sms");
    }
}
class InterfaceExample {
    public static void main(String[] args) {
        SmartPhone S =new  SmartPhone();
        S.videoCall();
        S.click();
        S.record();
        S.play();
        S.stop();
        S.call();
        S.sms();

        System.out.println();
        phone pp = new phone();
        pp.call();
        pp.sms();

        System.out.println();
        phone p = new SmartPhone();
        p.call();
        p.sms();

        System.out.println();
        ICamera IC = new SmartPhone();
        IC.click();
        IC.record();

        System.out.println();
        IMusicPlayer IM = new SmartPhone();
        IM.play();
        IM.stop();
    }
}
