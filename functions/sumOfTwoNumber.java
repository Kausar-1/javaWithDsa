package functions;
import java.util.Scanner;
class sumOfTwoNumber{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num= s.nextInt();
        System.out.println("Enter second number : ");
        int num2 = s.nextInt();
        int sum=0;
        sum = num + num2;
        System.out.println("The sum of two numbers are : "+ sum);
    }
}