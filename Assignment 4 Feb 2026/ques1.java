import java.util.*;
abstract class WarehouseItem {
    String name;

    WarehouseItem(String name) {
        this.name = name;
    }

    abstract void show();
}
class Electronics extends WarehouseItem {
    Electronics(String name) {
        super(name);
    }
    void show() {
        System.out.println("Electronics Item: " + name);
    }
}
class Groceries extends WarehouseItem {
    Groceries(String name) {
        super(name);
    }

    void show() {
        System.out.println("Grocery Item: " + name);
    }
}
class Storage<T extends WarehouseItem> {
    List<T> items = new ArrayList<>();

    void addItem(T item) {
        items.add(item);
    }

    List<T> getItems() {
        return items;
    }
}
class WarehouseUtil {
    static void displayItems(List<? extends WarehouseItem> list) {
        for (WarehouseItem item : list) {
            item.show();
        }
    }
}


public class ques1{
    public static void main(String[] args) {
        Storage<Electronics> store = new Storage<>();

        store.addItem(new Electronics("Laptop"));
        store.addItem(new Electronics("Mobile"));

        WarehouseUtil.displayItems(store.getItems());
    }
}
