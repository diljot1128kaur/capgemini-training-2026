public class togglecase {
    public static void main(String[] args) {
        String str="java programming";//JaVa PrOgRaMmInG;
        StringBuilder result=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(i%2==0){
                if(Character.isLowerCase(ch)){
                    result.append(Character.toUpperCase(ch));
                }else{
                    result.append(Character.toLowerCase(ch));
                }
            }else{
                result.append(ch);
            }
        }
        System.out.println(result.toString());
        
    }
}
