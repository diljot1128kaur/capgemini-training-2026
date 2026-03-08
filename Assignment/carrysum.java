public class carrysum {
    public static int carrysum(int n,int m){
        int carry=0;
        int count=0;
        while(n>0 || m>0){
            int d1=n%10;
            int d2=m%10;
            if(d1+d2+carry>9){
                count++;
                carry=1;
            }
            else{
                carry=0;
            }
            n=n/10;
            m=m/10;
        }
        return count;
    }
    public static void main(String[] args){
       int n=334;
       int m=567;
        System.out.println(carrysum(n,m));
    }
}