public class RatInMaze {
    public static void main(String[] args) {
        int grid[][]={{1,1,1},{1,1,1},{0,1,1},{1,1,1}};
        path(grid,0,0,"");


    }
    public static void path(int grid[][],int r,int c,String str){
        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length || grid[r][c]==0){
            return ;
        }

        if(r==grid.length-1 && c==grid[0].length-1){
            System.out.println(str);
            return;
        }
        grid[r][c]=0;
        path(grid, r, c+1, str+"R");
        path(grid, r+1, c, str+"D");
        path(grid, r-1, c, str+"U");
        path(grid, r, c-1, str+"L");
        grid[r][c]=1;
    }
    
}
