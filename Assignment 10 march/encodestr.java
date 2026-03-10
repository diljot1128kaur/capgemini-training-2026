import java.util.*;
public class encodestr{
    public static void main(String[] args){
        String str="101101110";//ABC
        int count=0;
        StringBuilder result=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='1'){
                count++;
            }
            else{
                if(count>0){
                    result.append((char)('A'+count-1));
                    count=0;
                }
            }
        }
        System.out.println(result.toString());
        

    }
}