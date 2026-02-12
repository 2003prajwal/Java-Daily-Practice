import java.util.Scanner;

class Studentt{
    private int rollNO;
    private String name;
    private double marks;

    public int getRollNo(){
        return rollNO;
    }

    public void setRollNO(int r){
        rollNO = r;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }

    public double getMarks(){
        return marks;
    }

    public void setMarks(double m){
        if (m>=0)
         marks = m;
        else
            marks=0;
    }

    public char getGrade(){
        if (marks>=75)
            return 'A';
        else if (marks >= 50) {
            return 'B';
        }
        return 'C';
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Studentt S = new Studentt();

        System.out.print("Enter Roll no: ");
        S.setRollNO(input.nextInt());

        System.out.print("Enter Name: ");
        S.setName(input.next());

        System.out.print("Enter Marks: ");
        S.setMarks(input.nextDouble());

        System.out.println();

        System.out.println("=== Student Details ===");
        System.out.print("Roll no:");
        System.out.println(S.getRollNo());

        System.out.print("Name: "+S.getName());
        System.out.println("Marks: "+S.getMarks());
        System.out.println("Grade: "+S.getGrade());
    }
}
