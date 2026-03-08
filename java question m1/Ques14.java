import java.util.*;
public class Ques14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=10;i++){
            int val=n*i;
            sum+=val;
            if(i<10) System.out.print(val+",");
            else System.out.print(val);
        }
        System.out.println("\n"+sum);
        sc.close();
    }
}
