import java.util.Scanner;

class student{
    int roll;
    String name;
    String course;
    int m1,m2,m3;

    public double total(){
        return m1+m2+m3;
    }
    public double avg(){
        return total()/3;
    }
    public void grade(){
        if (total()>=75)
            System.out.println("A");

        else if (total()<75 && total() >=50) {
            System.out.println("B");
        }
        else System.out.println("C");
    }
    public String details(){
        return "Roll no:"+roll+"\n"+"Name: "+name+"\n"+"Course:"+course+"\n";
    }
}
class ClassStudent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        student s= new student();

        System.out.print("Student Name: ");
        s.name = input.next();

        System.out.print("Student Course: ");
        s.course = input.next();

        System.out.print("Enter M1 Marks: ");
        s.m1 = input.nextInt();

        System.out.print("Enter M2 Marks: ");
        s.m2 = input.nextInt();

        System.out.print("Enter M3 Marks: ");
        s.m3 = input.nextInt();

        System.out.println("===Student Details===");
        System.out.println(s.details());
        System.out.println("Total: "+s.total());
        System.out.println("Average: "+s.avg());
        System.out.println("Grade: ");
        s.grade();

    }
}
