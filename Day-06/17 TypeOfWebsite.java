import java.util.Scanner;

class TypeOfWebsite {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Domain Name: ");
        String Domain = input.nextLine();
        String ext = Domain.substring(Domain.lastIndexOf(".")+1);
        switch (ext){
            case "com":
                System.out.println("Commercial");
                break;
            case "gov":
                System.out.println("Government");
                break;
            case "org":
                System.out.println("Organisation");
                break;
            case"net":
                System.out.println("Network");
                break;
        }
    }
}
