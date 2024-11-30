public class Search {
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},{11,22,33,44},{111,222,333,444}};
       boolean ans= LinearSearch(matrix,44);
       System.out.println(ans);
    }
    public static boolean LinearSearch(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.println("Found at index :");
                    System.out.println("("+i +"," +j+")");
                    return true;
                }

            }
        }
        System.out.println("NOT FOUND");
        return false;
    }
    
}
