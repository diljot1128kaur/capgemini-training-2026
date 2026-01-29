import java.util.*;

class PairWithGivenSum {

    static boolean hasPair(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();

        for (int x : arr) {
            if (set.contains(target - x))
                return true;
            set.add(x);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int target = sc.nextInt();
        System.out.println(hasPair(arr, target));
        sc.close();
    }
}
