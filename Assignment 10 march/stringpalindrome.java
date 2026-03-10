public class stringpalindrome{
    public static boolean ispalindrome(String s){
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args){
        String str="this is level 51";//level
        String[] arr=str.split(" ");
        for(String s:arr){
            if(ispalindrome(s)){
                System.out.println(s);
            }
        }
        
    
    }
}