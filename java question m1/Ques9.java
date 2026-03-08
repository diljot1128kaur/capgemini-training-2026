import java.util.*;
public class Ques9 {
    public static int numberOfCarry(int n1,int n2){
        int cnt=0, carry=0;
        while(n1>0 || n2>0){
            int d1=n1%10;
            int d2=n2%10;
            int val=d1+d2+carry;
            if(val>9){
                cnt++;
                carry=1;
            }
            else carry=0;
            n1/=10;
            n2/=10;
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println(numberOfCarry(num1,num2));
        sc.close();
    }
}
