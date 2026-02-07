import java.util.*;
class ValidUsername{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        if(n<5 || n>15 || !Character.isLetter(s.charAt(0))){
            System.out.println("Not a valid username");
            return;
        }
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(!Character.isLetter(ch) && !Character.isDigit(ch) && ch!='_'){
                System.out.println("Not a valid username");
                return;
            }
        }
        System.out.println("A valid username");
        sc.close();

    }
}