class studenttt{
    private String name;
    private int roll;
   private int marks;

   studenttt(String name, int r, int m){
       this.name=name;
       roll = r;
       marks = m;
   }

   void display(){
       System.out.println("Name: "+name+", Roll: "+roll+", Marks: "+marks);
   }
}
class WithConstructorEasy {
    public static void main(String[] args) {

        // Object is ready with values automatically
        studenttt s1 =new  studenttt("Prajwal",1,3);
        s1.display();
    }
}
