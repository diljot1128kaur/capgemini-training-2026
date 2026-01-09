public class secondlargest{
    public static void main(String[] args){
        int[] arr={1,4,5,6,9};
        
        int largest=Integer.MIN_VALUE;
        int secondlargest=Integer.MIN_VALUE;

        for(int i:arr){
            if(i>largest){
                secondlargest=largest;
                largest=i;
            }
            else if(i>secondlargest && largest!=i) {
                secondlargest=i;
            }
        }
        if(secondlargest==Integer.MIN_VALUE) System.out.println("no second largest");

        System.out.println(secondlargest);
    }
}