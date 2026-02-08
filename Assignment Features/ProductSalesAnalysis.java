import java.util.*;
import java.util.stream.Collectors;

class Sale {
    int productId;
    int quantity;
    double price;

    Sale(int productId, int quantity, double price) {
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
    }
}

class ProductSales {
    int productId;
    double totalRevenue;

    ProductSales(int productId, double totalRevenue) {
        this.productId = productId;
        this.totalRevenue = totalRevenue;
    }

    public double getTotalRevenue() {
        return totalRevenue;
    }

    public String toString() {
        return productId + " -> " + totalRevenue;
    }
}

public class ProductSalesAnalysis {
    public static void main(String[] args) {

        List<Sale> sales = Arrays.asList(
            new Sale(101, 20, 100),
            new Sale(102, 5, 200),
            new Sale(103, 15, 300),
            new Sale(104, 25, 150)
        );

        List<ProductSales> topProducts =
            sales.stream()
                .filter(s -> s.quantity > 10)
                .map(s -> new ProductSales(
                        s.productId,
                        s.quantity * s.price
                ))
                .sorted(Comparator.comparing(ProductSales::getTotalRevenue).reversed())
                .limit(5)
                .collect(Collectors.toList());

        topProducts.forEach(System.out::println);
    }
}
