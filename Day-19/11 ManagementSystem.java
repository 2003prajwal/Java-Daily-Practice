import java.util.Scanner;

class Product{
    private long productId;
    private String productName;
    private double price;
    private int quantity;

    public void setProductId(long id){
        productId  = id;
    }
    public long getProductId(){
        return productId;
    }

    public  void setProductName(String name){
        productName = name;
    }
    public String getProductName(){
        return productName;
    }
    public void setPrice(double p){
        if (p>0 && quantity > 0)
            price = p * quantity;
        else
            price = 0;
    }

    public void setQuantity(int q){
        if (q > 0)
            quantity = q;
        else
            quantity = 0;
    }

    public int getQuantity(){
        return quantity;
    }

    public double discount(double per){
        double decreaseAmount = (price*per)/100;
        price = price - decreaseAmount;
        return price;
    }

    public double getPrice(){
        return price;
    }
}
class ManagementSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Product P = new Product();

        System.out.print("Product ID: ");
        P.setProductId(input.nextLong());

        System.out.print("Product Name: ");
        P.setProductName(input.next());

        System.out.print("Enter Quantity: ");
        P.setQuantity(input.nextInt());

        System.out.print("Enter Prise: ");
        P.setPrice(input.nextDouble());

        System.out.print("Enter Percentage: ");
        double per = input.nextDouble();

        System.out.println("=== Details ===");
        System.out.print("Product Id: ");
        System.out.println(P.getProductId());

        System.out.print("Product Name: ");
        System.out.println(P.getProductName());

        System.out.println("Quantity: "+P.getQuantity());

        System.out.println("Prise Without Discount: "+ P.getPrice());


        P.discount(per);
        System.out.print("Total With "+per+"% "+"Discount: ");
        System.out.println(P.getPrice());


    }
}