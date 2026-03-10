public class longestletter{
    public static void main(String[] args){
        String str="internationalization";
        String longest=" ";
        longest+=str.charAt(0);
        int count=0;
        for(int i=1;i<str.length()-1;i++){
            count++;

        }
        longest+=count;
        longest+=str.charAt(str.length()-1);
        System.out.println(longest);
    }
}