public class Diamond {
    public static void main(String[] args) {
        int n=8;int m=7;
        for(int row=1;row<=n/2;row++){
            for(int col=1;col<=(m+1)/2;col++){

              if((row+col >=5) ){
                System.out.print("*");
              }
            
            else{
                System.out.print(" ");
            }
            }
            for(int col=1;col<=(m+1)/2;col++){

              if((row>col)  ){
                System.out.print("*");
              }
            
            else{
                System.out.print(" ");
            }
            }
            System.out.println();
        }

        for(int row=n/2;row>=1;row--){
          for(int col=1;col<=(m+1)/2;col++){
            
            if((row+col >=5) ){
              System.out.print("*");
            }
          
          else{
              System.out.print(" ");
          }
          }
          for(int col=1;col<=(m+1)/2;col++){

            if((row>col)  ){
              System.out.print("*");
            }
          
          else{
              System.out.print(" ");
          }
          }
          System.out.println();
      }
       
       
        
    }
}
