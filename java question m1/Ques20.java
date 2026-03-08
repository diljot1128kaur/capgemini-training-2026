import java.util.*;
public class Ques20 {
    public static int expo(int a, int b){
        int max=-1,val=a;
        
        for(int i=a;i<=b;i++){
            int cnt=0;
            int j=i;
            while(j%2==0){
                cnt++;
                j/=2;
            }
            if(cnt>max){
                max=cnt;  
                val=i;  
            } 
        }
        return val;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(expo(a,b));
        sc.close();
    }
}
