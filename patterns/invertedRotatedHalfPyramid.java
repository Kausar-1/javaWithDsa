
  //     *
  //    **
  //   ***
  //  ****
import java.util.Scanner;

public class invertedRotatedHalfPyramid {
  public static void invertedHalfPyramid(int n) {
    for(int i=1;i<=n;i++){
      for(int j=1;j<=n-i;j++){
        System.out.print(" ");
      }
      for(int j =1; j<=i; j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    invertedHalfPyramid(4);
  }
}
