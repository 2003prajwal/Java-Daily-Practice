class Productt{
    private String itemNo;
    private String name;
    private double price;
    private short qty;

    public String getItemNo(){
        return itemNo;
    }

    public String getName(){
        return name;
    }

    public void setPrice(double price){
        this.price=price;
    }

    public double getPrice(){
        return price;
    }

    public void setQty(short qty){
        this.qty=qty;
    }

    public short getQty(){
        return qty;
    }

   public Productt (String itemNo, String name){
        this.itemNo=itemNo;
        this.name=name;
    }

    public Productt(String itemNo, String name, double price, short qty){
        this.itemNo = itemNo;
        this.name=name;
        setPrice(price);
        setQty(qty);
    }
}
class ConstructorEx {
    public static void main(String[] args) {
        Productt p = new Productt("242a", "prs",43,(short) 1);
        System.out.println("Item No: "+p.getItemNo());
        System.out.println("Name: "+p.getName());
        System.out.println("Price: "+p.getPrice());
        System.out.println("Quantity: "+p.getQty());

    }
}
