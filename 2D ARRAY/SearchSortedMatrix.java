public class SearchSortedMatrix {
     public static void main(String[] args) {

    int matrix[][]={{1,2,3,4},{11,22,33,44},{111,222,333,444}};
     System.out.println(Brute(matrix,33));
     System.out.println();
      System.out.println(BinarySearch(matrix,11));
      System.out.println();
      System.out.println(Staircase(matrix,444));
    }
    // O(n^2)
    public static boolean Brute(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
            if(matrix[i][j]==key){
                System.out.println("Found at index :");
                System.out.println("("+i +"," +j+")");
                return true;
            }
            }
        }
        return false;
    }
    // O(nlogn)
    public static boolean BinarySearch(int matrix[][],int key){
        
        for(int i=0;i<matrix.length;i++){
            int StartColumn=0;
           int EndColumn=matrix[0].length-1;
            while(StartColumn<=EndColumn){
                int mid=(StartColumn+EndColumn)/2;
                if(matrix[i][mid]==key){
                    System.out.println("Found at index :");
                    System.out.println("("+i +"," +mid +")");
                    return true;

                }
                else if(matrix[i][mid]<key){
                    StartColumn=mid+1;
                    
                }
                else{
                    EndColumn=mid-1;
                }
            }
           }
           return false;
        }

// O(n+m); 
        public static boolean Staircase(int matrix[][],int key){
            int col=matrix[0].length-1;
            int row=0;
            while(row<=matrix.length-1 && col>=0){
                if(matrix[row][col]==key){
                    System.out.println("Found at index :");
                    System.out.println("("+row +"," +col +")");
                    return true;

                }
                if(matrix[row][col]<key){
                    row++;
                    
                }
                else {
                    col--;
                }
            }
            return false;

        }
        
    }
   
    

