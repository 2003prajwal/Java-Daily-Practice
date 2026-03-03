import java.util.Scanner;

class UncheckException1 {
    void checkNumber(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Number cannot be negative");
        }
        else
            System.out.println("Valid NUmber");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = input.nextInt();
        UncheckException1 u = new UncheckException1();
        try {
            u.checkNumber(num);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }
}
