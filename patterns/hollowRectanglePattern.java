package patterns;
// * * * * * *
// *         *
// *         *
// * * * * * *

import java.util.Scanner;
public class hollowRectanglePattern {
    public static void hollowRectangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n+1; j++){
                if(i==1 || i==n || j==1 || j==n+1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of row : ");
        int r = s.nextInt();
        hollowRectangle(r);
    }
}
