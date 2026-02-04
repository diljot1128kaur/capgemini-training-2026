// Product categories
class BookCategory {}
class ClothingCategory {}

// Generic Product class
class Product<T> {
    String name;
    double price;
    T category;
    Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    void show() {
        System.out.println(name + " : " + price);
    }
}
class DiscountUtil {
    static <T extends Product<?>> void applyDiscount(T product, double percent) {
        product.price -= product.price * percent / 100;
    }
}


public class ques2{
    public static void main(String[] args) {
        Product<BookCategory> book =
                new Product<>("Java Book", 500, new BookCategory());

        Product<ClothingCategory> shirt =
                new Product<>("T-Shirt", 1000, new ClothingCategory());

        DiscountUtil.applyDiscount(book, 10);
        DiscountUtil.applyDiscount(shirt, 20);

        book.show();
        shirt.show();
    }
}
