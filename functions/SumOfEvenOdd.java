package functions;
import java.util.Scanner;

public class SumOfEvenOdd{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int i,num,EvenSum=0,OddSum=0;
        for(i=0; i<5;i++){
            System.out.println("Enter the number : ");
            num = s.nextInt();

            if(num%2==0){
                EvenSum+= num;
            }else{
                OddSum +=num;
            }
        }
        System.out.println("The sum of odd number : "+OddSum);
        System.out.println("The sum of even numbers : "+EvenSum);
    }
}