import java.util.Scanner;
public class ifElse{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a year to check leap or not : ");
        int num=s.nextInt();
        if(num%4==0){
            if(num % 400 ==0){
                System.out.println(num+" Leap year");
            }
            else if(num % 100!=0){
                    System.out.println(num+" Leap year");
            }else{
                    System.out.println(num+" Not Leap year");
                }
        }else{
            System.out.println(num+" Not Leap year");
        }
       
    }
}