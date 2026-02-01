import java.util.Scanner;

class BasicOfArray{

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int B[]={1,4,3,6,3};
            B[1]=23;
            for (int i=0; i<B.length; i++){
                System.out.println(B[i]++);
            }
            System.out.println();

            for (int X:B){
                System.out.println(X);
            }


        }
    }
