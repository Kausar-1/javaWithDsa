

public class sumOf2ndRow {
  public static boolean sumOf2ndRowElement(int matrix[][]){
    int sum=0;
    for(int i=0;i<matrix.length;i++){
      for(int j=0;j<matrix[0].length;j++){
        if(i == 1)
        sum += matrix[i][j];
      }
    }
    System.out.println("sum of second row is = "+sum);
    return true;
  }
  public static void main(String[] args) {
    int matrix[][] = { {1,4,9 },
                      { 11,4,3 },
                      {2,2,3} };

sumOf2ndRowElement(matrix);
  }
}
