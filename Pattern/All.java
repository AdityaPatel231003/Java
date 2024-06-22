public class All {
    public static void HollowRectangle( int n,int m){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==1||i==n || j==1||j==m ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }

    public static void InvertedhalfRotatedpyramid(int n){
      for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            if(j+i>n){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();

      }

    }

    public static void  Inverted_Half_Pyramid_With_Number(int n){
        int i=1;
        while(i<=n){
          
          for(int j=1;j<=n;j++){
            if(j+i<=n+1){
                System.out.print(j);
            }
            else{
                System.out.print(" ");
            }

          }
           
            System.out.println();

            i++;


        }
    }
    public static void floyd_Triangle( int n){
        int i=1;
        int counter=1;
        while(i<=n){
            for(int j=1;j<=i;j++){
               
                    System.out.print(counter + " ");
                    counter++;
                }
                System.out.println();
    
                i++;
    
              }
               
               

        }
        public static void binary_Triangle(int n){
            int i=1;
            
            while(i<=n){
                for(int j=1;j<=i;j++){
                   
                        if((i+j)%2==0){
                            System.out.print("1");

                        }
                        else System.out.print("0");
                    }
                    System.out.println();
        
                    i++;
        
                  }

        }
        public static void  butterfly(int n){

            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){

                    System.out.print("*");
                
                }
                for(int j=1;j<=2*(n-i);j++){
                    System.out.print(" ");
                
                }
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                
                }

                System.out.println();
                

            }
            for(int i=n;i>=1;i--){
                for(int j=1;j<=i;j++){

                    System.out.print("*");
                
                }
                for(int j=1;j<=2*(n-i);j++){
                    System.out.print(" ");
                
                }
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                
                }

                System.out.println();
                

            }
        }
        public static void Solid_Rhombus(int n,int m){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=(m+1)/2;j++){
                     if(j+i<=n+1){
                        System.out.print(" ");
                     }
                    

                }
                for(int j=1;j<=n+1;j++){
                    
                       System.out.print("*");
                    }
                    System.out.println();

               }
               

            }
            public static void Hollow_Solid_Rhombus(int n,int m){
                for(int i=1;i<=n;i++){
                    for(int j=1;j<=(m+1)/2;j++){
                         if(j+i<=n+1){
                            System.out.print(" ");
                         }
                        
    
                    }
                    for(int j=1;j<=n+1;j++){
                        if(i==1||i==n||j==1||j==n+1){
                            System.out.print("*");
                        }
                        else
                        System.out.print(" ");
                           
                        }
                        System.out.println();
    
                   }
                   
    
                }
        public static void Diamond(int n){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");

                }
                for(int j=1;j<=(2*i)-1;j++){
                    System.out.print("*");

                }
                System.out.println();
            }

            for(int i=n;i>=1;i--){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");

                }
                for(int j=1;j<=(2*i)-1;j++){
                    System.out.print("*");

                }
                System.out.println();
            }
        }

public static void Number_Pyramid(int n) {
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            if(i+j>=n+1){
                System.out.print(i+" ");
            }
            else System.out.print(" ");
        }
        System.out.println();
    }
}
    public static void Pallndromic(int n){

        for(int i=1;i<=n;i++){

            for(int j=1;j<=n-i;j++){
                System.out.print(" ");

            }

            int counter=i;
            for(int j=1;j<=i;j++){
                
                System.out.print(counter);
                counter--;
            }

            
            for(int j=1;j<i;j++){
                
                System.out.print(j+1);
           

            }
            System.out.println();
        }
    }
     public static void main(String[] args) {
        // HollowRectangle(4,5);
        // InvertedhalfRotatedpyramid(4);
        // Inverted_Half_Pyramid_With_Number(5);
        // floyd_Triangle(5);
        // binary_Triangle(5);
        // butterfly(4);
        // Solid_Rhombus(4,9);
        // Hollow_Solid_Rhombus(4,9);
        // Diamond(4);
        // Number_Pyramid(5);
        Pallndromic(5);
    }
    
    
}
