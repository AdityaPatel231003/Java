public class Sudoko {
    public static boolean SudokoSolver(int sudo[][],int row,int col){
        // basecase
        if(row==9){
            return true;
        }

        // recursion

        int nextrow=row,nextcol=col+1;
        if(col+1==9){
            nextrow=row+1;
            nextcol=0;
        }
        if(sudo[row][col]!=0){
            return SudokoSolver(sudo, nextrow, nextcol);
        }
        if(sudo[row][col]==0){
            for(int digit=1;digit<=9;digit++){
                if(isSafe(sudo,row,col,digit)){
                    sudo[row][col]=digit;
                   if(SudokoSolver(sudo, nextrow, nextcol)) {
                    return true;
                   }
                   sudo[row][col]=0;
    
                }
            }
        }
        
        return false;
    }
    public static boolean isSafe(int sudo[][],int row,int col,int digit){
        // row
        for(int i=0;i<=8;i++){
            if(sudo[i][col]==digit){
                return false;
            }
        }
        // col
        for(int j=0;j<=8;j++){
            if(sudo[row][j]==digit){
                return false;
            }
        }
        // grid
        int sr=(row/3)*3;
        int sc=(col/3)*3;
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(sudo[i][j]==digit){
                    return false;
                }
            }
            
        }
        return true;
    }
    public static void main(String[] args) {
        int sudo[][]={  {5, 0, 4, 0, 0, 8, 9, 0, 2} ,
           {0, 0, 2, 1, 9, 0, 0, 4, 8} ,
            {0, 0, 0, 0, 0, 2, 0, 6, 7},
           {8, 0, 9, 7, 6, 1, 0, 2, 3} ,
           {4, 2, 0, 0, 0, 0, 7, 9, 1 } ,
           {0, 0, 3, 0, 2, 0, 0, 5, 6}  ,
           { 9, 0, 1, 5, 3, 0, 0, 0, 0 },
           {0, 0, 0, 0, 1, 9, 6, 3, 5 } ,
           {3, 0, 0, 2, 8, 0, 0, 0, 9 } };
         
           if(SudokoSolver(sudo,0,0)){
            System.out.println("Exist :-");
            print(sudo);
           }
           else{
            System.out.println("Not Exist :");
           }
        
    }
    public static void print(int sudo[][]){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(sudo[i][j] +" ");
            }
            System.out.println();
        }
    }
    
}
