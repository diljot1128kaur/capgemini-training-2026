import java.util.*;

class QueueUsingStacks {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    void enqueue(int x) {
        s1.push(x);
    }

    int dequeue() {
        if (s1.isEmpty() && s2.isEmpty()) {
            System.out.println("Queue Empty");
            return -1;
        }

        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueUsingStacks q = new QueueUsingStacks();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            q.enqueue(sc.nextInt());
        }

        System.out.println("Dequeued element: " + q.dequeue());
        sc.close();
    }
}
