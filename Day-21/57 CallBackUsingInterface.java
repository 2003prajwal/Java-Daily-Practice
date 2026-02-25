interface MyCallBack{
    void onEvent();
}
class Client implements MyCallBack{
    @Override
    public void onEvent(){
        System.out.println("Event Received In Client!");
    }
}
class EventGenerator{
    MyCallBack callBack;

    //Constructor to receive Callback object
    EventGenerator(MyCallBack callBack){
        this.callBack = callBack;
    }
    void triggerEvent(){
        System.out.println("Event Triggered");
        callBack.onEvent();
    }
}
class CallBackUsingInterface {
    public static void main(String[] args) {
        Client c = new Client();
        EventGenerator eg = new EventGenerator(c);
        eg.triggerEvent();
    }
}
