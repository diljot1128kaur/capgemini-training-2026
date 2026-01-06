package Level1_06_01_26;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // 2
        int table[] = new int[10];

        // Store results
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = num * i;
        }

        // Display results
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + table[i - 1]);
        }
    }
}
//Problem 3

//Create a program to print a multiplication table of a number.
//        Hint =>
//Get an integer input and store it in the number variable. Also, define a integer array to store the results of multiplication from 1 to 1
//Run a loop from 1 to 10 and store the results in the multiplication table array
//Finally, display the result from the array in the format number * i = ___
