import java.util.Scanner;
public class sumOfDigits {
    public static int digitsSum(int n){
        int sum = 0, lastDigit;
        while(n > 0){
            lastDigit = n % 10;
            sum += lastDigit;
            n /= 10;
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number to know its digit sum : ");
        int num = s.nextInt();

        System.out.println("The sum of digits of "+num +" is "+digitsSum(num));
    }
}
