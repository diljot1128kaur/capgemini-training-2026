import java.util.*;

class LongestConsecutiveSequence {

    static int longestSeq(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int maxLen = 0;

        for (int x : arr)
            set.add(x);

        for (int x : arr) {
            if (!set.contains(x - 1)) {
                int curr = x;
                int count = 1;

                while (set.contains(curr + 1)) {
                    curr++;
                    count++;
                }
                maxLen = Math.max(maxLen, count);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println(longestSeq(arr));
        sc.close();
    }
}
