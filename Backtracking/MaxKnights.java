public class MaxKnights {
    static int maxKnights=-1;
    static int TotalWays=0;
    static int ForNumber=3;
    public static void main(String[] args) {
        char chessBoard[][]=new char[3][3]; 
        for(int i=0;i<chessBoard.length;i++){
            for(int j=0;j<chessBoard[0].length;j++){
                chessBoard[i][j]='X';
            }
        }
        KnightsProblem(chessBoard,0,0,0);
        System.out.println("Total Ways ="+TotalWays);
        System.out.println("MaxKnights :"+maxKnights);

    }
    // KnightsProblem
    public static void KnightsProblem(char chessBoard[][],int R,int C,int max){
          if(R>=chessBoard.length){
            if(ForNumber==max){
            print(chessBoard);
            TotalWays=TotalWays+1;
           
            }
             maxKnights=Math.max(maxKnights, max);
            //  TotalWays=TotalWays+1;
            
            return;
          }


          else if(isSafe(chessBoard, R, C)){
                chessBoard[R][C]='K';
                if(C==chessBoard.length-1){
                    KnightsProblem(chessBoard, R+1, 0, max+1);
                } else {
                    KnightsProblem(chessBoard, R, C+1, max+1);
                }
                chessBoard[R][C]='X';

          }
        //   Not Safe
            

            if(C==chessBoard[0].length-1)   KnightsProblem(chessBoard, R+1, 0, max);
            else     KnightsProblem(chessBoard, R, C+1, max);
                
             
                   
                

    }
     // isSAfe
     public static boolean isSafe(char chessBoard[][],int R,int C){
        int i=R-2;
        int j=C+1;
          if(i>=0 && i<chessBoard.length && j>=0 && j<chessBoard.length && chessBoard[i][j] =='K'){
             return false;
          }
          i=R-2;
          j=C-1;
        if(i>=0 && i<chessBoard.length && j>=0 && j<chessBoard.length && chessBoard[i][j]=='K' ){
         return false;
        }
        i=R-1;
        j=C+2;
        if( i>=0 && i<chessBoard.length && j>=0 && j<chessBoard.length && chessBoard[i][j] =='K'){
         return false;
        }
        i=R-1;
        j=C-2;
         if(i>=0 && i<chessBoard.length && j>=0 && j<chessBoard.length && chessBoard[i][j]=='K'){
             return false;
         }
         i=R+1;
         j=C+2;
        if(i>=0 && i<chessBoard.length && j>=0 && j<chessBoard.length && chessBoard[i][j] =='K'){
         return false;
        }
        i=R+1;
        j=C-2;
       if(i>=0 && i<chessBoard.length && j>=0 && j<chessBoard.length && chessBoard[i][j] =='K'){
         return false;
       }
       i=R+2;
       j=C+1;
        if(i>=0 && i<chessBoard.length && j>=0 && j<chessBoard.length && chessBoard[i][j]=='K'){
         return false;
        }
        i=R+2;
        j=C-1;
        if(j>=0 && i<chessBoard.length  && chessBoard[i][j] =='K'){
         return false;
 
        }
        return true;
 
     }

    // Print
       // print 
       public static void print(char chessBoard[][]){
        System.out.println("------------Chess Board-------------");
        for(int i=0;i<chessBoard.length;i++){
            for(int j=0;j<chessBoard.length;j++){
                System.out.print(chessBoard[i][j] +" ");
            }
            System.out.println();
        }
       
    }

    
}
