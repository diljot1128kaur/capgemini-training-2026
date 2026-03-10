public class repeatedstring{
    public static void main(String[] args){
        int n=3;
        String str="abc";
        StringBuilder s=new StringBuilder();
        while(n>0){
           s.append(str);
           n--;
        }
        System.out.println(s.toString());
    }
}