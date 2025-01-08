package functions;
import java.util.Scanner;

public class averageOfThreeNumbers {
    public static double avgOfThreeNum(double a, double b, double c){
        double sum = a + b + c;
        double avg = sum / 3;
        return avg;
    }
    public static void main (String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter three numbers : ");
        Double a = s.nextDouble();
        Double b = s.nextDouble();
        Double c = s.nextDouble();
        System.out.println("Average of "+a +", "+b+", "+c+ " is : "+avgOfThreeNum(a,b,c));
        
    }
}
