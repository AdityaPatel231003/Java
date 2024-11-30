public class SpiralMatrix {
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        Spiral(matrix);
    }
    public static void Spiral(int matrix[][]){
        int StartingRow=0;
        int EndingRow=matrix.length-1;
        int StartingColumn=0;
        int EndingColumn=matrix[0].length-1;
        while( StartingRow<=EndingRow &&  StartingColumn<=EndingColumn){

            // Top
            for(int j=StartingRow;j<=EndingColumn;j++){
                System.out.print(matrix[StartingRow][j] +" ");
            }
            // Right
            for(int i=StartingRow+1;i<=EndingRow;i++){
                System.out.print(matrix[i][EndingColumn] +" ");
            }
            // Bottom
            for(int j=EndingColumn-1;j>=StartingColumn;j--){
                if(StartingRow==EndingRow){
                    break;
                }
                System.out.print(matrix[EndingRow][j] +" ");
            }
            // Left
            for(int i=EndingRow-1;i>=StartingRow+1;i--){
                if(StartingColumn==EndingColumn){
                    break;
                }
                System.out.print(matrix[i][StartingColumn] +" ");
            }
             StartingRow++;
             EndingRow--;
             StartingColumn++;
             EndingColumn--;

        }
    }
    
}
