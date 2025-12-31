//Write a Program to compute the volume of Earth in km^3 and miles^3
public class ques7 {
    public static void main(String[] args){
        double radius = 6371; // in km
        double volumeInKm3 = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
        double volumeInMiles3 = volumeInKm3 * 0.621371; // Convert km^3 to miles^3
        System.out.println("The volume of earth in cubic kilometers is " + volumeInKm3 + " and cubic miles is " + volumeInMiles3);
    }
}
