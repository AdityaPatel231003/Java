public class DiagonalSum {
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        BruteForce(matrix);
        BigONComplexity(matrix);
        // only for n=m matrix
    }
    public static void BruteForce(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                // Primary Diagonal
                if(i==j){
                    sum+=matrix[i][j];
                }
                //  Secondary Diagonal
                else if(i!=matrix.length-1-i){
                    if(i+j==matrix.length-1){
                        sum+=matrix[i][j];
                    }
                }
                
            }
        }
        System.out.println(sum);
    }
    public static void BigONComplexity(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            sum+=matrix[i][i];
            if(i!=matrix.length-1-i){
                
                    sum+=matrix[i][matrix.length-1-i];
                
            }
        }
        System.out.println(sum);
    }
    
}
