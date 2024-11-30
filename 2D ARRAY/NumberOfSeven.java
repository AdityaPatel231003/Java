public class NumberOfSeven {
    public static void main(String[] var0) {
        int[][] matrix = new int[][]{{1, 8, 3, 4}, {5, 7, 7, 8},{5,8,9,10},{7,19,110,81}};
        int seven = 7;
        int count= 0;
  
        for(int i= 0; i < matrix.length;i++) {
           for(int j = 0; j < matrix[0].length; j++) {
              if (matrix[i][j] == seven) {
                 count++;
              }
           }
        }
  
        System.out.println(count);
     }
    
}
