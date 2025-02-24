public class GridwaysLinearTC {
    public static void main(String[] args) {
            // (0,0)->(n-1,m-1)
            int Grid[][]=new int[4][3];
            int ans=Ways(Grid,Grid.length,Grid[0].length);
          System.out.println( ans);
        }
        // TC=O((n+m))
        // TC=O(n)
        public static int Ways(int Grids[][],int n,int m){
            int totalCharacter=(n-1+m-1);
            int Perm_For_N=(n-1);
            int Perm_For_M=(m-1);

            int totaways=fact(totalCharacter)/(fact(Perm_For_N)*fact(Perm_For_M));
            return totaways;

        }
        public static int fact(int f){
            int ans_of_Fact=1;
            for(int i=f;i>=1;i--){
                ans_of_Fact*=i;
            }
            return ans_of_Fact;
        }
    }

