import java.util.Scanner;

class UnchecksExceptionsPractice2 {
    void registerUser(int age) throws IllegalArgumentException{
        if (age<18){
            throw new IllegalArgumentException("Age must be 18 or older");
        }
        if (age > 100){
            throw new IllegalArgumentException("Age cannot be more than 100");
        }else
            System.out.println("User registered successfully");
    }

    public static void main(String[] args) {
        UnchecksExceptionsPractice2 u = new UnchecksExceptionsPractice2();
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Enter Age: ");
            int age = input.nextInt();
            u.registerUser(age);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
