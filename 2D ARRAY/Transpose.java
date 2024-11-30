public class Transpose {
    public static void main(String[] args) {
        // only for n==m
    int matrix[][]={{1,8,3},{5,7,7},{8,9,10}};
    int n=matrix.length;
    int m=matrix[0].length;
    int transposematrix[][]=new int[n][m];
    for(int i=0;i<n;i++){
       for(int j=0;j<m;j++){
        transposematrix[j][i]=matrix[i][j];

       }
    }
    System.out.println(" ranspose matrix :");

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
            System.out.print(transposematrix[i][j] +" ");
            }
            System.out.println();
   }
 }
}

