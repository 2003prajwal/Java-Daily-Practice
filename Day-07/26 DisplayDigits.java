import java.util.Scanner;

class DisplayDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = input.nextInt();

        while (num > 0){
           int Reminder = num%10;
            num = num/10;
            System.out.println(Reminder);
        }
    }
}
