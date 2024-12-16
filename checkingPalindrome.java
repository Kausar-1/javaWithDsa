import java.util.Scanner;
public class checkingPalindrome {
    public static boolean isPalindrome(int n){
        int N = n;
        int rev = 0, rem = 0;
        while(n>0){
            rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }
        if( N == rev){
            return true;
        }else{
            return false;
        }
    }
    
    
    public static void main ( String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number to check palindrome or not : ");
        int num = s.nextInt();
        if(isPalindrome(num)){
            System.out.println( num + " is a palindrome.");
        }else{
            System.out.println(num + " is not a palindrome.");
        }
    }
}
