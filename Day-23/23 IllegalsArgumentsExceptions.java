import java.util.Scanner;

class IllegalsArgumentsExceptions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = input.nextInt();
        try {
            if (age<0){
                throw new IllegalArgumentException("Age cannot be negative");//must throw
            }
            if (age < 18) {
              //  throw new IllegalArgumentException("For Driving age must be grater than 18");
                System.out.println("Not Eligible For Driving");
            }
            else
                System.out.println("Eligible For Driving");
        }
        catch (IllegalArgumentException e){
            System.out.println(e);
        }
    }
}
