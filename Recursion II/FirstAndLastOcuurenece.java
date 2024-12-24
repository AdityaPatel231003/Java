public class FirstAndLastOcuurenece {
    public static void main(String[] args) {
        String str="abcaadefghijkla";
       
        FLOcuurences(str ,0,'a');
    }
    public static int F=-1;
    public static int L=-1;
    public static void FLOcuurences(String str ,int i,char element){

        if(i==str.length()){
            System.out.println("first = " +F );
            System.err.println("Last = " +L);
            return;
        }
        if(str.charAt(i)==element){
                if(F==-1){
                    F=i;
                }
                else if (F>=0) {
                    L=i;
                    
                }
                
        }
        FLOcuurences(str,  i+1,  element);
    }
}
