public class Minfood{
    public static void main(String[] args){
        int r=7;
        int unit=2;
        int[] arr={2,8,3,5,7,4,1,2};
        int foodneeded=r*unit;
        int j=0;
        int foodsofar=0;
        for(int i=0;i<arr.length;i++){
            foodsofar+=arr[i];
            j++;
            if(foodsofar>=foodneeded){
                System.out.println(j);
                break;
            }

        }
        
    }
}