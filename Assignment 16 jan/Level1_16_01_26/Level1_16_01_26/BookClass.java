package Level1_16_01_26;

class Book{
    String title;
    String author;
    int price;

    Book(){
        System.out.println("Default Constructor");
    }

    Book(String title,String auther,int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
}
public class BookClass {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("abd","shfj",6);
        System.out.println(b2.price+" "+ b2.title+" "+b2.author);
    }
}
