public class CountWayOfNQuuen {

public static boolean  isSafe(char board[][],int r ,int col){
    for(int i=r-1;i>=0;i--){
        if(board[i][col]=='Q'){
            return false;
        }
    }
    // left Diagonal
    for(int i=r-1,j=col-1;i>=0 && j>=0;i--,j--){
        if(board[i][j]=='Q'){
            return false;
        }
    }
    // Right Diagonal
    for(int i=r-1,j=col+1;i>=0 && j<board.length;i--,j++){
        if(board[i][j]=='Q'){
            return false;
        }
    }
    return true;
}
    public static void Nqueen(char board[][],int row){
        if(row==board.length){
          count++;
        print(board);
            return ;

        }

        for(int j=0;j<board[0].length;j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                Nqueen(board,row+1);
                    board[row][j]='X';
            }
           
        }

    }
    static int count=0;
    public static void main(String[] args) {
        int n=4;
            char board[][]=new char[n][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    board[i][j]='X';
                }
            }
         
            Nqueen(board,0);
            System.out.println(count);
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