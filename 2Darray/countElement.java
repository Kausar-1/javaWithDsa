
public class countElement {
  public static int count(int matrix[][], int key) {
    int numOfElement = 0;
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        if (matrix[i][j] == key) {
          numOfElement++; 
        }
      }
    }
    System.out.println(numOfElement);
    return numOfElement;
  }

  public static void main(String args[]) {
    int matrix[][] = { { 4, 7, 8 },
        { 8, 8, 7 } };
    int key = 7;
    count(matrix, key);
  }
}