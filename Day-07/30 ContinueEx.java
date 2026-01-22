import java.util.Scanner;

class ContinueEx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //In that code we skip multiple of 10.
        while (true){
            System.out.print("Enter Your Number: ");
            int num = input.nextInt();
            if (num%10==0){
                continue;
            }
            System.out.println("Number :"+num);
        }
    }
}
