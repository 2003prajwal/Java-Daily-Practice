class  practice{

   private int age;
    String name;

    int ages;
    String names;
  public int getAge(){
      return age;
  }
  public void setAge(int age){
      this.age=age;
  }
  public String getName(){
      return name;
  }
  public void SetName(String name){
      this.name=name;
  }

  //User-defined Default Constructor
  public practice(){
      name = "Prajwal";
      age = 21;
  }

}
class Basic {
    public static void main(String[] args) {
        practice P = new practice();
        System.out.println(P.ages);
        System.out.println(P.names);

        System.out.println();

        practice P1 = new practice();
        System.out.println(P1.getAge());
        System.out.println(P1.name);

    }
}
