package Level1_06_01_26;

import java.util.Scanner;

public class MeanOfHeightOfPlayers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double heights[] = new double[11];
        for(int i =0;i<11;i++){
            heights[i] = sc.nextDouble();
        }

        double sum = 0;
        for(int i =0;i<11;i++){
            sum += heights[i];
        }

        double meanHeigh = sum/11;
        System.out.println("Mean Heights is: "+ meanHeigh);
    }
}


//Problem 6

//Create a program to find the mean height of players present in a football team.
//        Hint =>
//The formula to calculate the mean is: mean = sum of all elements / number of elements
//Create a double array named heights of size 11 and get input values from the user.
//Find the sum of all the elements present in the array.
//Divide the sum by 11 to find the mean height and print the mean height of the football team
