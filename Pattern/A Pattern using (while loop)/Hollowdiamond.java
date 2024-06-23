public class Hollowdiamond {
    public static void foor(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i+j==n+1){
                    System.out.print("*");
                }
                
                if(i+j<n+1){
                    System.out.print(" ");
                }
    
            }
            for(int j=1;j<=2*(i-1)-1;j++){
            
                    System.out.print(" ");
                
                 
            }
            for(int k=1;k<=1;k++){
                if(i==1){
                    System.out.print(" ");
                }
                else{
                    System.err.print("*");
                }
            }
            System.out.println(" ");
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n;j++){
                if(i+j==n+1){
                    System.out.print("*");
                }
                
                if(i+j<n+1){
                    System.out.print(" ");
                }
    
            }
            for(int j=1;j<=2*(i-1)-1;j++){
            
                    System.out.print(" ");
                
    
            }
            for(int k=1;k<=1;k++){
                if(i==1){
                    System.out.print(" ");
                }
                else{
                    System.err.print("*");
                }
            }
            System.out.println(" ");
        }
    
    }
    public static void whiile(int n){
            
        
        int total=2*n;
     
       int  star=1;
       
          
       int spaces=n-1;
       int current=1;

        while(current<=total){
            
      
if (current<=n){
    int twoSpaces=2*(current-1)-1;
            
    for(int i=1;i<=spaces;i++){
        System.out.print(" ");
    }
   for(int j=1;j<=star;j++){
    System.out.print("*");
   }

   for(int i=1;i<=twoSpaces;i++){
    System.out.print(" ");
    
}

for(int i=1;i<=star;i++){
    
    if(current==1){
        System.out.print(" ");
    }
    else
    System.out.print("*");
}


    System.out.println();
    spaces--;
}
else{ spaces++;
    int  twoSpaces=(2*n+1)-current;
    int ok=2*(twoSpaces-1)-1;
            
    for(int i=1;i<=spaces;i++){
        System.out.print(" ");
    }
   for(int j=1;j<=star;j++){
    System.out.print("*");
   }

   for(int i=1;i<=ok;i++){
    System.out.print(" ");
    
}

for(int i=1;i<=star;i++){
    if(current==total){
        System.out.print(" ");
    }
    else
    System.out.print("*");
}


    System.out.println();

   
    
}

            
          
           
    
          
             
            current++;

        }
    }


    public static void main(String[] args) {
        int n=5;
        foor(n);
        whiile(n);
    }
}
