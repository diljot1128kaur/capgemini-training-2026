import java.util.*;

class ZeroSumSubarray {

    static void checkZeroSum(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;

        for (int x : arr) {
            sum += x;

            if (sum == 0 || map.containsKey(sum)) {
                System.out.println("Zero sum subarray exists");
                return;
            }
            map.put(sum, 1);
        }
        System.out.println("No zero sum subarray");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        checkZeroSum(arr);
        sc.close();
    }
}
