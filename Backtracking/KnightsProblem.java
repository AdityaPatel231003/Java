public class KnightsProblem {
    public static void main(String[] args) {
        int grid[][]={{0,3,6},{5,8,1},{2,7,4}};
        if(Ans(grid,0,0,grid.length,0)){
            System.out.println("Exist :");
        }
       else{
        System.out.println("Not Exist :");
       } 
    }
    public static boolean Ans(int grid[][],int R,int C,int n,int expVal){
        if(R<0 || C<0|| R>=n || C>=n || grid[R][C]!=expVal){
            return false;
        }
        if(expVal==(n*n)-1){
            return true;
        }
       boolean ans1=Ans(grid, R-2, C+1, n, expVal+1);
       boolean ans2=Ans(grid, R-2, C-1, n, expVal+1);
        boolean ans3=Ans(grid, R-1, C+2, n, expVal+1);
        boolean ans4=Ans(grid, R-1, C-2, n, expVal+1);
        boolean ans5=Ans(grid, R+1, C+2, n, expVal+1);
        boolean ans6=Ans(grid, R+1, C-2, n, expVal+1);
        boolean ans7=Ans(grid, R+2, C+1, n, expVal+1);
        boolean ans8=Ans(grid, R+2, C-1, n, expVal+1);

        return ans1 || ans2 || ans3 || ans4 || ans5 || ans6 || ans7 || ans8;

    }
    
}
