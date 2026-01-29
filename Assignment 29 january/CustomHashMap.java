import java.util.*;

class CustomHashMap {

    class Node {
        int key, value;
        Node next;

        Node(int k, int v) {
            key = k;
            value = v;
        }
    }

    int SIZE = 5;
    Node[] table = new Node[SIZE];

    int hashFunction(int key) {
        return key % SIZE;
    }

    void put(int key, int value) {
        int index = hashFunction(key);
        Node head = table[index];

        while (head != null) {
            if (head.key == key) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        Node newNode = new Node(key, value);
        newNode.next = table[index];
        table[index] = newNode;
    }

    int get(int key) {
        int index = hashFunction(key);
        Node head = table[index];

        while (head != null) {
            if (head.key == key)
                return head.value;
            head = head.next;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CustomHashMap map = new CustomHashMap();

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            int v = sc.nextInt();
            map.put(k, v);
        }

        int searchKey = sc.nextInt();
        System.out.println(map.get(searchKey));
        sc.close();
    }
}
