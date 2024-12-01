public class Pallindrone {
    public static void main(String[] args) {
        String str=new String("Aditya");
        System.out.println(pall(str));
    }
    public static boolean pall(String str){
        int n=str.length()-1;
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(n-i)){
                System.out.println("Not a Pallindrone");
                return false;
            }
        }
        System.out.println("Pallindrrone");
        return true;
    }
    
}
