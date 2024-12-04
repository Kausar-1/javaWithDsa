import java.util.Scanner;

public class numberIsPrime {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number to check prime or not : ");
        int n=s.nextInt();
        if (n<2){
            System.out.println(n+ " is not a prime number.");
        }
        int div=2;
        boolean isPrime =true;
        int N=n;
        
           while(div<=Math.sqrt(n)){
                if(N%div==0){
                    isPrime =false;
                    break;
                }
                div +=1;
            }
        

        if (isPrime){
            System.out.println(n+ " is a prime number.");

        }
        else{
            System.out.println(n+ " is not a prime number.");
        }
          
      
        
    }
}

