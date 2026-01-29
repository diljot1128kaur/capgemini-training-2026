import java.util.*;

class SearchComparison {

    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }

    static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int target = sc.nextInt();

        long start = System.nanoTime();
        linearSearch(arr, target);
        long end = System.nanoTime();
        System.out.println("Linear Search Time: " + (end - start));

        Arrays.sort(arr);

        start = System.nanoTime();
        binarySearch(arr, target);
        end = System.nanoTime();
        System.out.println("Binary Search Time: " + (end - start));
        sc.close();
    }
}
