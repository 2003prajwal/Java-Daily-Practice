import java.util.Scanner;

class SwitchCases {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter URL: ");
        String url = input.nextLine();
        String protocol = url.substring(0,url.indexOf(":"));
        if (protocol.equals("http")){
            System.out.println("Hyper Text Transfer Protocol");
        } else if (protocol.equals("ftp")) {
            System.out.println("File Transfer Protocol");
        } else {
            System.out.println("Hyper Text Transfer Protocol Secure");
        }
        String ext = url.substring(url.lastIndexOf(".")+1);
        if (ext.equals("com")){
            System.out.println("Commercial");
        } else if (ext.equals("gov")) {
            System.out.println("Government");
        } else if (ext.equals("org")) {
            System.out.println("Organisation");
        }else System.out.println("Network");
    }
}

