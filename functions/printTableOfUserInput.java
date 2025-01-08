package functions;
import java.util.Scanner;
public class printTableOfUserInput {
    public static void main (String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number for table : ");
        int N = s.nextInt();
        System.out.println("The tabel of "+N +":");
        for(int i=1;i<=10;i++){
            System.out.println(N+"*" +i+ "= " + N*i);
        }
    }
}
