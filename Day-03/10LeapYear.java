import java.util.Scanner;

class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your year: ");
        long Year = input.nextLong();
        if (Year % 4== 0 && Year % 100!=0||(Year%400==0)){
            System.out.println("Leap Year");
        }
        else System.out.println("Not leap year");
    }
}
