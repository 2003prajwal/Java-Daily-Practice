import java.util.Scanner;

class PProduct{
    private String productName;
    private double price;

    public String getProductName(){
        return productName;
    }

    public double getPrice(){
        return price;
    }
    PProduct(String productName, double price){
      this.productName  = productName;
      this.price = price;
    }
   public void setPrice(double price){
        this.price=price;
   }
}
class Electronics extends  PProduct{
    String brand;
    int warrantyYears;

    Electronics(String productName, double price, String brand, int warrantyYears){
        super(productName,price);
        this.brand=brand;
        this.warrantyYears=warrantyYears;
    }
    public void applyDiscount(double percentage){
        double discount = (getPrice()*percentage)/100;
        double newPrice = getPrice() - discount;


        setPrice(newPrice);
        System.out.println("Discount Rs: "+discount);
        System.out.println("Price With "+percentage+"% Discount: "+newPrice);
    }
}
class ElectronicsProduct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Product Name: ");
        String prName =input.next();

        System.out.print("Price Of Product: ");
        double price = input.nextDouble();

        System.out.print("Brand Of Product: ");
        String brand = input.next();

        System.out.print("Warranty Of Product: ");
        int warranty = input.nextInt();

        Electronics E = new Electronics(prName,price,brand,warranty);

        System.out.print("Discount in percentage: ");
        double percentage = input.nextDouble();

        System.out.println(E.getPrice());
        E.applyDiscount(percentage);
    }
}
