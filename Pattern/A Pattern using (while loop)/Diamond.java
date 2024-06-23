public class Diamond {
    public static void main(String[] args) {
        
        int n=5;
       
        int spaces=n-1;
        int star=1;
        int total=2*5-1;
        int current=1;
        while(current<=total){
            for(int i=1;i<=spaces;i++){
                System.out.print(" ");
            }
            for(int i=1;i<=star;i++){
                System.out.print("*");
            }
          
            System.out.println(" ");
            if(current<n){
                star+=2;
                spaces--;

            }
            else{
                spaces++;
                star-=2;
                
            }
           
            current++;
        }
    }
}
    
