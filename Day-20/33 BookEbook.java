class Book{
    String title = "Rich Dad Poor Dad ";
    String author = "Kiosaki";
    double price = 434;

    void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

class Ebook extends Book{
    double fileSize = 49;

   void displayEbookDetails(){
       displayBookDetails();
       System.out.println("File Size: "+ fileSize+"MB");
    }
}

class BookEbook {
    public static void main(String[] args) {
        Ebook B = new Ebook();
        B.displayEbookDetails();
    }
}
