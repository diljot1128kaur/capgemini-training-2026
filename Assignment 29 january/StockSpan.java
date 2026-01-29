import java.util.*;

class StockSpan {

    static void calculateSpan(int[] price) {
        Stack<Integer> st = new Stack<>();
        st.push(0);
        System.out.print("1 ");

        for (int i = 1; i < price.length; i++) {
            while (!st.isEmpty() && price[st.peek()] <= price[i]) {
                st.pop();
            }

            int span = st.isEmpty() ? i + 1 : i - st.peek();
            System.out.print(span + " ");
            st.push(i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter days: ");
        int n = sc.nextInt();
        int[] price = new int[n];

        for (int i = 0; i < n; i++) {
            price[i] = sc.nextInt();
        }

        calculateSpan(price);
        sc.close();
    }
}

