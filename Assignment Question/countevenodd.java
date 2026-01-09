import java.util.*;
public class countevenodd{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int evencount=0;
        int oddcount=0;
        while(n>0){
            int digit=n%10;
            if(digit%2==0){
                evencount++;
            }
            else{
                oddcount++;
            }
            n/=10;
        }
        System.out.println(evencount);
        System.out.println(oddcount);
        sc.close();
    }
}