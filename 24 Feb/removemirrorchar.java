public class removemirrorchar {
    public static String mirrorstr(String str){
        int n=str.length();
        int mid=n/2;
        for(int i=0;i<mid;i++){
            if(str.charAt(i)!=str.charAt(n-i-1)){
                return str;
            }
        }
        if(n%2==0){
            return str.substring(0,mid);

        }
        else{
            return str.substring(0,mid+1);
        }
    }
    public static void main(String[] args){
        String str="abccba";//abc
        String result=mirrorstr(str);
        System.out.println(result);
       

    
        
            
        
    }
}
