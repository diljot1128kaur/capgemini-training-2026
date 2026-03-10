public class removeelement{
    public static void main(String[] args){
        int[] arr={11,11,11,20,20,30};//112030
        int n=arr.length;
        int unique=0;
        for(int i=0;i<n-1;i++){
            if(arr[i]!=arr[i+1]){
                arr[unique++]=arr[i];
            }
        }
        arr[unique++]=arr[n-1];
        for(int i=0;i<unique;i++){
            System.out.print(arr[i]+" ");
        }
    }
}