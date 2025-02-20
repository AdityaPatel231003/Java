public class Nquuen {
    public static void main(String[] args) {
        // Initialize chess Board
        int n=5;
            char board[][]=new char[n][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    board[i][j]='X';
                }
            }
            Nqueen(board,0);
    }
    // Nqueen
    public static void Nqueen(char board[][],int row){
            if(row==board.length){
                print(board);
                return;
            }

        for(int j=0;j<board[0].length;j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                Nqueen(board, row+1);
                board[row][j]='X';
            }
           
        }
    }

    // isSafe 
    public static boolean isSafe(char board[][],int r,int col){
        // Vertical Top
      for(int i=r-1;i>=0;i--){
        if(board[i][col]=='Q'){
            return false;
        }
      }

    //   left Diagonal
    for(int i=r-1,j=col-1;i>=0 && j>=0;i--,j--){
        if(board[i][j]=='Q'){
            return false;
        }
      }
       //   right Diagonal
    for(int i=r-1,j=col+1;i>=0 && j<board.length;i--,j++){
        if(board[i][j]=='Q'){
            return false;
        }
      }

        return true;

    }

    // print 
    public static void print(char board[][]){
        System.out.println("------------Chess Board-------------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j] +" ");
            }
            System.out.println();
        }
       
    }

}
