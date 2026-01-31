package Level1_31_01_26;

import java.util.Scanner;

public class CountingSort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] ages = new int[n];

        System.out.println("Enter student ages:");
        for (int i = 0; i < n; i++) {
            ages[i] = sc.nextInt();
        }

        int minAge = 10;
        int maxAge = 18;
        int range = maxAge - minAge + 1;

        int[] count = new int[range];
        int[] output = new int[n];

        for (int i = 0; i < n; i++) {
            count[ages[i] - minAge]++;
        }

        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        // Place elements into output array (stable sort)
        for (int i = n - 1; i >= 0; i--) {
            int age = ages[i];
            int index = age - minAge;
            output[count[index] - 1] = age;
            count[index]--;
        }

        for (int i = 0; i < n; i++) {
            ages[i] = output[i];
        }

        System.out.println("Sorted Student Ages :");
        for (int i = 0; i < n; i++) {
            System.out.print(ages[i] + " ");
        }

        sc.close();
    }
}
