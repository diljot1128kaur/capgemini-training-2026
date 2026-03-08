import java.util.*;
public class Ques11 {
    public static int opChoice(int a, int b, int c){
        if(c==1) return a+b;
        else if(c==2) return a-b;
        else if(c==3) return a*b;
        else if(c==4) return a/b;
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(opChoice(a,b,c));
        sc.close();
    }
}
