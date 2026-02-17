class studentts{
    String name;
    int roll;
   int marks;

    void display(){
        System.out.println("Name: " + name + ", Roll: " + roll + ", Marks: " + marks);
    }
}
class WithoutConstructorHard {
    public static void main(String[] args) {
        studentts s = new studentts();

        // Must manually set each value
        s.name = "Prajwal";
        s.roll = 32;
        s.marks = 100;

        s.display();
    }
}
