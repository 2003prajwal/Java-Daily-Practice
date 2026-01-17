import java.util.Scanner;

class GreatestOfThreeNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter No 1:");
        float A = input.nextFloat();
        System.out.print("Enter No 2: ");
        float B = input.nextFloat();
        System.out.print("Enter No 3: ");
        float C = input.nextFloat();
        if (A > B && A > C) System.out.println("1 is Greatest");
        else if (B > A && B > C) System.out.println("2 is Greatest");
         else System.out.println("3 is Greatest");
        }
    }

