import java.util.*;

class SortStackRecursion {

    static void sortStack(Stack<Integer> st) {
        if (!st.isEmpty()) {
            int x = st.pop();
            sortStack(st);
            insertSorted(st, x);
        }
    }

    static void insertSorted(Stack<Integer> st, int x) {
        if (st.isEmpty() || st.peek() <= x) {
            st.push(x);
            return;
        }
        int temp = st.pop();
        insertSorted(st, x);
        st.push(temp);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();

        System.out.print("Enter stack size: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            st.push(sc.nextInt());
        }

        sortStack(st);

        System.out.println("Sorted Stack:");
        while (!st.isEmpty()) {
            System.out.print(st.pop() + " ");
        }
        sc.close();
    }
}
