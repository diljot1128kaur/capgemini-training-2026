public class Ques18 {
    public static double distance(int x1,int y1,int x2,int y2){
        return Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
    }
    public static void main(String[] args){
        int x1=1, y1=1;
        int x2=2, y2=4;
        int x3=3, y3=6;

        double d1 = distance(x1,y1,x2,y2);
        double d2 = distance(x2,y2,x3,y3);
        double d3 = distance(x1,y1,x3,y3);
        double sum = d1 + d2 + d3;
        System.out.println(sum);
    }
}

