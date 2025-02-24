public class WaysInRATinMaze {

        public static void main(String[] args) {
            int grid[][]={{1,1,1},{1,1,1},{0,1,1},{1,1,1}};
        int ans=    path(grid,0,0);
        System.out.println(ans);
    
    
        }
        public static int path(int grid[][],int r,int c){
            if(r<0 || c<0 || r>=grid.length || c>=grid[0].length || grid[r][c]==0){
                return 0;
            }
    
            if(r==grid.length-1 && c==grid[0].length-1){
                
                return 1;
            }
            grid[r][c]=0;
         int an= path(grid, r, c+1)+  path(grid, r+1, c ) + path(grid, r-1, c)+  path(grid, r, c-1);
           
            grid[r][c]=1;
            return an;
        }
        
    
    
    
}
