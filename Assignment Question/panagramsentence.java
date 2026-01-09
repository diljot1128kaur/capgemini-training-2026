import java.util.*;
public  class panagramsentence{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        String sent=sc.nextLine();
        sent=sent.toLowerCase();    
        HashSet<Character> set=new HashSet<>();
        for(char ch:sent.toCharArray()){
            if(ch>='a' && ch<='z'){
                set.add(ch);
            }
        }
        if(set.size()==26){
            System.out.println("Panagram");
        }
        else{
            System.out.println("Not a Panagram");
        }
        sc.close();
    }
}
