import java.util.*;
public class maxdiff {
    public static void main(String[] args){
        int[] arr={2,7,3,1,9};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]-arr[0]);
        
    }
}
