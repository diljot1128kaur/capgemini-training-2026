import java.util.*;

public class simpleInterest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int p=scn.nextInt();
        int r=scn.nextInt();    
        int t=scn.nextInt();
        double si=SI(p,r,t);
        System.out.println( si);
    }
    public static double SI(int p,int r,int t){
        double si=(p*r*t)/100.0;
        return si;
    }
}
