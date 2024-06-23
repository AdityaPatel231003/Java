public class butterfly {
    public static void fly(int n){
        int m=10;
        
        for(int i=1;i<=n;i++){

            for(int j=1;j<=m;j++){
                
                if((i>=j)&&(i+j<=m))
                {
                    System.out.print("*");
                }
               else if((i+j>=m)&&(j>=i))
                {
                    System.out.print("*");
                }
                else
                System.out.print(" ");

            }
           
            
            System.out.println(" ");
        }
      
        for(int i=n-1;i>=1;i--){

            for(int j=1;j<=m;j++){
                
                if((i>=j)&&(i+j<=m))
                {
                    System.out.print("*");
                }
               else if((i+j>=m)&&(j>=i))
                {
                    System.out.print("*");
                }
                else
                System.out.print(" ");

            }
           
            
            System.out.println(" ");
        }

    }
    public static void ffly(int n){
       int star=1;
       
       int total=2*n;
       int space=total-2;
       int current=1;
       while(current<=total){
        //star
        for(int i=1;i<=star;i++){
            System.out.print("*");
        }
        //space
        for(int i=1;i<=space;i++){
            System.out.print(" ");
        }
        //star
        for(int i=1;i<=star;i++){
            System.out.print("*");
        }
System.out.println(" ");
if (current<n){
    star++;
    space-=2;

}
else{
    star--;
    space+=2;
}

      
current++;

       }
    }
    public static void main(String[] args) {
        
        int n=5;
        fly(n);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        ffly(n);
    }
}