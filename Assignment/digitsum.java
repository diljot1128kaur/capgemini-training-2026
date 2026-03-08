public class digitsum{
    public static int sumofdigit(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n=n/10;
        }
        return sum;
    }
    public static int digitdiff(int n,int m){
        int divf=0;
        int divs=0;
        for(int i=n;i<=m;i++){
            if(i%4==0){
                divf+=sumofdigit(i);
            }
            if(i%7==0){
                divs+=sumofdigit(i);
            }
        }
        return divf-divs;
    }
    public static void main(String[] args){
        int n=50;
        int m=120;
        System.out.println(digitdiff(n,m));

    }
}