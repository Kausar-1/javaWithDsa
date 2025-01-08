package functions;
import java.util.Scanner;

class calculateSimpleInterest{
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the principal :  ");
        int p= s.nextInt();
        System.out.println("Enter the rate : ");
        int r = s.nextInt();
        System.out.println("Enter the time : ");
        int t = s.nextInt();
        int SI=(p*r*t)/100;
        System.out.println("The simple interest for principal "+ p+ " and rate "+r+" and time for "+t+" is :  "+SI);


    }
}