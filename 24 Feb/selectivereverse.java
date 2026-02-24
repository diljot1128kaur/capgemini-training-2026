public class selectivereverse {
    public static void main(String[] args){
        String str="I love Java Programming Very Much";
        String[] words=str.split(" ");
        StringBuilder result=new StringBuilder();
        for(int i=0;i<words.length;i++){
            if(i%2!=0){
                result.append(new StringBuilder(words[i]).reverse().toString()).append(" ");
            }else{
                result.append(words[i]).append(" ");
            }
        }
        System.out.println(result.toString());

    }
}
