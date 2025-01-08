package functions;
import java.util.Scanner;

public class findSumOfNaturalNumber {
    public static void main(String args[]){
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the nth term to sum   : ");
        int num=s.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++){
            sum+=i;
        }
        System.out.println("The sum of natural number of "+ num + " th term is " +sum);
    }    
}
