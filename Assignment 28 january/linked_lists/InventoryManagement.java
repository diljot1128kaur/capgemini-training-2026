public class InventoryManagement {
    int itemId;
    String itemName;
    double price;
    int quantity;
    InventoryManagement next;

    InventoryManagement(int itemId, String itemName, double price, int quantity) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
        this.next = null;
    }

    public static void main(String[] args) {
        InventoryManagementLinkedList list = new InventoryManagementLinkedList();

        list.addAtBeginning(101, "Pen", 10.5, 20);
        list.addAtTheEnd(103, "Book", 120.0, 5);
        list.addAtPosition(2, 102, "Pencil", 5.0, 50);
        list.addAtTheEnd(104, "Eraser", 3.0, 30);

        list.searchItem(102);
        list.updateQuantity(103, 10);

        System.out.println("Total Inventory Value: " + list.calculateCost());

        System.out.println("\nBefore Sorting by Price:");
        list.display();

        list.sortByPrice(true); 
        System.out.println("\nAfter Sorting by Price (Ascending):");
        list.display();

        list.sortByPrice(false); 
        System.out.println("\nAfter Sorting by Price (Descending):");
        list.display();

        list.deleteItem(101);
        System.out.println("\nAfter Deleting Item 101:");
        list.display();
    }
}

class InventoryManagementLinkedList {
    InventoryManagement head;

    void addAtBeginning(int itemId, String itemName, double price, int quantity) {
        InventoryManagement newNode = new InventoryManagement(itemId, itemName, price, quantity);
        newNode.next = head;
        head = newNode;
    }

    void addAtTheEnd(int itemId, String itemName, double price, int quantity) {
        InventoryManagement newNode = new InventoryManagement(itemId, itemName, price, quantity);
        if (head == null) {
            head = newNode;
            return;
        }
        InventoryManagement temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
    }

    void addAtPosition(int position, int itemId, String itemName, double price, int quantity) {
        InventoryManagement newNode = new InventoryManagement(itemId, itemName, price, quantity);
        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }
        int cnt = 1;
        InventoryManagement temp = head;
        while (temp != null) {
            if (cnt == position - 1) {
                newNode.next = temp.next;
                temp.next = newNode;
                return;
            }
            temp = temp.next;
            cnt++;
        }
    }

    void deleteItem(int id) {
        if (head == null) return;
        if (head.itemId == id) {
            head = head.next;
            return;
        }
        InventoryManagement temp = head;
        while (temp.next != null) {
            if (temp.next.itemId == id) {
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
    }

    void searchItem(int id) {
        InventoryManagement temp = head;
        while (temp != null) {
            if (temp.itemId == id) {
                System.out.println("Item found");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found");
    }

    void updateQuantity(int id, int qty) {
        InventoryManagement temp = head;
        while (temp != null) {
            if (temp.itemId == id) {
                temp.quantity = qty;
                return;
            }
            temp = temp.next;
        }
    }

    double calculateCost() {
        InventoryManagement temp = head;
        double sum = 0;
        while (temp != null) {
            sum += temp.price * temp.quantity;
            temp = temp.next;
        }
        return sum;
    }

    void sortByPrice(boolean asc) {
        head = mergeSort(head, asc);
    }

    InventoryManagement mergeSort(InventoryManagement node, boolean asc) {
        if (node == null || node.next == null) return node;
        InventoryManagement mid = getMiddle(node);
        InventoryManagement nextMid = mid.next;
        mid.next = null;
        InventoryManagement left = mergeSort(node, asc);
        InventoryManagement right = mergeSort(nextMid, asc);
        return merge(left, right, asc);
    }

    InventoryManagement merge(InventoryManagement a, InventoryManagement b, boolean asc) {
        if (a == null) return b;
        if (b == null) return a;

        boolean condition = asc ? a.price <= b.price : a.price > b.price;

        if (condition) {
            a.next = merge(a.next, b, asc);
            return a;
        } else {
            b.next = merge(a, b.next, asc);
            return b;
        }
    }

    InventoryManagement getMiddle(InventoryManagement head) {
        InventoryManagement slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    void display() {
        InventoryManagement temp = head;
        while (temp != null) {
            System.out.println(temp.itemId + " " + temp.itemName + " " + temp.price + " " + temp.quantity);
            temp = temp.next;
        }
    }
}
