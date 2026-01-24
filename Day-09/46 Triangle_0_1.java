import java.util.Scanner;
 class Triangle_0_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = input.nextInt();
        for (int i=1; i<=num; i++){
            for (int j=1; j<=i; j++){
                int cal = i+j;
                if (cal%2==0){
                    System.out.print(1+" ");
                }else System.out.print(0+" ");
            }
            System.out.println();
        }
    }
}
