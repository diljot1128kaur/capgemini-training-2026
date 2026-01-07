public class football {
    public static int[] genHeights(){
        int[] arr=new int[11];
        for(int i=0;i<11;i++){
            arr[i]=(int)(101*Math.random())+150;
        }
        return arr;
    }
    public static int shortest(int[] arr) {   
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    public static int tall(int[]arr){
        int max=arr[0];
        for(int h:arr){
            if(h>max){
                max=h;
            }
        }
        return max;
    }
    public static int mean(int[] arr){
        int sum=0;
        for(int h:arr){
            sum+=h;
        }
        return sum/arr.length;
    }

    public static void main(String[] args) {
        int[]hei=genHeights();

        for(int h:hei){
            System.out.println(h);
        }

        System.out.println("short height "+shortest(hei));
        System.out.println("tall height "+tall(hei));
        System.out.println("mean height "+mean(hei));
    }
}
