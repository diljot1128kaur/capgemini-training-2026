public class rotationpalindrome {
    public static boolean isPalindrome(String str){
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        
        String str="abc";
        String temp=str+str;
        boolean isPalindrome=false;
        for(int i=0;i<str.length();i++){
            String sub=temp.substring(i,i+str.length());
            if(isPalindrome(sub)){
                isPalindrome=true;
                break;
            }
        }
        if(isPalindrome){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
        
    }
}

