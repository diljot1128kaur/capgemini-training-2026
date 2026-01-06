package Level1_06_01_26;

import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ele[] = new int[5];
        for(int i=0;i<ele.length;i++){
            ele[i] = sc.nextInt();
        }

        for(int i =0;i<ele.length;i++){
            if(ele[i]>0){
                if(ele[i]%2==0){
                    System.out.println("Even Number");
                }
                else{
                    System.out.println("Odd Number");
                }
            }
            else if(ele[i]<0){
                System.out.println("Negative");
            }
            else if(ele[i]==0){
                System.out.println("Zero");
            }


        }
        if(ele[0]>ele[ele.length-1]){
            System.out.println("Greater");
        }
        else if(ele[0]<ele[ele.length-1]){
            System.out.println("Lesser");
        }
        else{
            System.out.println("Equal");
        }

    }
}


//Problem 2

//Write a program to take user input for 5 numbers and check whether a number is positive,  negative, or zero. Further for positive numbers check if the number is even or odd. Finally compare the first and last elements of the array and display if they equal, greater or less
//Hint =>
//Define an integer array of 5 elements and get user input to store in the array.
//Loop through the array using the length If the number is positive, check for even or odd numbers and print accordingly
//If the number is negative, print negative. Else if the number is zero, print zero.
//Finally compare the first and last element of the array and display if they equal, greater or less
