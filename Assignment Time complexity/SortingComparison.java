import java.util.*;

class SortingComparison {

    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int[] arr3 = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
            arr2[i] = arr1[i];
            arr3[i] = arr1[i];
        }

        long start = System.nanoTime();
        bubbleSort(arr1);
        long end = System.nanoTime();
        System.out.println("Bubble Sort: " + (end - start));

        start = System.nanoTime();
        Arrays.sort(arr2); // TimSort (Merge + Insertion)
        end = System.nanoTime();
        System.out.println("Merge/Quick Sort: " + (end - start));
    }
}
