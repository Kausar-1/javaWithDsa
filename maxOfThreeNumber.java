import java.util.Scanner;
public class maxOfThreeNumber {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number :  ");
        int a= s.nextInt();
        System.out.println("Enter the second number : ");
        int b= s.nextInt();
        System.out.println("Enter the third number : ");
        int c= s.nextInt();
        if (a>b){
                if(a>c){
                    System.out.println(a+" is the max number.");
                }
                else{
                    System.out.println(c+ " is the max number.");
                }
        }
        else{
            if(b>c){
                System.out.println(b+ " is the max number .");
            }
            else{
                System.out.println(c + " is the max number.");
            }
        }
    }
}
