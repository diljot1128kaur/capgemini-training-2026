import java.util.*;
public class Ques17 {
    public static int checkAutobiographical(String s){
        if(s==null) return 0;
        int n=s.length();
        int[] hash=new int[10];
        for(int i=0;i<n;i++){
            int num=s.charAt(i)-'0';
            hash[num]++;
        }
        //checking
        for(int i=0;i<n;i++){
            int val=s.charAt(i)-'0';
            if(hash[i]!=val) return 0;
        }
        int cnt=0;
        for(int num:hash){
            if(num!=0) cnt++;
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(checkAutobiographical(s));
        sc.close();
    }
}
