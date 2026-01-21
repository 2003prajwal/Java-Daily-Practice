import java.util.Scanner;
class ArithmeticOperationSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Menu===\n"+"ADD\n"+"SUB\n"+"DIV\n"+"MUL\n");
        System.out.print("Enter Value of A: ");
        int A = input.nextInt();
        System.out.print("Enter Value of B: ");
        int B = input.nextInt();
        input.nextLine();
        System.out.println("Enter Your Option: ");
        String option = input.nextLine();
        option =option.toUpperCase();
        switch (option){
            case "ADD":
                System.out.println("Addition of A and B: "+(A+B));
                break;
            case "SUB":
                System.out.println("Subtraction of A and B:"+(A-B));
                break;
            case "DIV":
                System.out.println("Division of A and B: "+A/B);
                break;
            case "MUL":
                System.out.println("Multiplication of A and B: "+(A*B));
                break;
            default:
                System.out.println("Invalid Option");
        }
    }
}
