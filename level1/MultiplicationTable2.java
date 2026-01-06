package Level1_06_01_26;

import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int array[] = new int[4];

        for(int i =6;i<=9;i++){
            array[i-6] = num*i;
        }

        for (int i = 6; i <= 9; i++) {
            System.out.println(num + " * " + i + " = " + array[i - 6]);
        }
    }
}

//Problem 5

//Create a program to find the multiplication table of a number entered by the user from 6 to 9 and display the result
//Hint =>
//Take integer input and store it in the variable number as well as define an integer array to store the multiplication result in the variable multiplicationResult
//Using a for loop, find the multiplication table of numbers from 6 to 9 and save the result in the array
//Finally, display the result from the array in the format number * i = ___
//
