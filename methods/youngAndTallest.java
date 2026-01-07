
import java.util.Scanner;



public class youngAndTallest {
    public static int findAge(int[] age){
        int minAge=age[0];
        for(int i=1;i<age.length;i++){
            if(age[i]<minAge){
                minAge=age[i];
            }
        }
        return minAge;
    }
    public static double findHeight(Double[] height){
        double maxheight=height[0];
        for(int i=1;i<height.length;i++){
            if(height[i]>maxheight){
                maxheight=height[i];
            }
        }
        return maxheight;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[]age=new int[3];
        Double[]hei=new Double[3];

        for(int i=0;i<3;i++){
            age[i]=scn.nextInt();
            hei[i]=scn.nextDouble();
        }

        System.out.println("young age "+ findAge(age));
        System.out.println("Tallest height "+ findHeight(hei));
    }
}
