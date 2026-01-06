package Level1_06_01_26;

import java.util.Scanner;

public class FactorOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int maxFactor = 10;
        int factors[] = new int[maxFactor];
        int index =0;
        for(int i =1;i<=number;i++){
            if(number%i==0)
            {
                if (index == factors.length) { // Resize array if full
                    int newSize = factors.length * 2;
                    int temp[] = new int[newSize];
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }
                    factors = temp;
                }

            }
            factors[index] = i;
            index++;
        }
        for(int i =0;i<index;i++){
            System.out.println(factors[i]);
        }

    }
}
