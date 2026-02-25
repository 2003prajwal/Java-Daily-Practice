class p{
   private void display(){
        System.out.println("Private");
    }
}
class q extends p{
    // Not allow annotation @Override
    public void display(){
      System.out.println("Public");
    }
}
class Overriding{
}
