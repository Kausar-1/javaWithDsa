import java.util.Scanner;
public class checkEvenOrNot {
    public static boolean isEven(int n){
        if(n % 2 == 0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        
   
    Scanner s = new Scanner(System.in);
    System.out.print("Enter a number to check even or not : ");
    int num = s.nextInt();
    
    if(isEven(num)){
        System.out.println(num+ " is an Even number.");
    }else{
        System.out.println(num + " is not an Even number.");
    }
}
    
}
