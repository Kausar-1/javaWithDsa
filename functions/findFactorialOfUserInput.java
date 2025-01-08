package functions;
import java.util.Scanner;
public class findFactorialOfUserInput {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int num, fact=1;
        System.out.println("Enter a number : ");
        num= s.nextInt();
        while(num>1){

            fact *=num;
            num--;
        }
        System.out.println("The factorial of the given number is : "+fact);
    }
}
