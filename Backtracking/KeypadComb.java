public class KeypadComb {
    public static void main(String[] args) {
        char[][] Keys = {{'.'},{'a','b','c'},{'d','e','f'},{'g','h','i'},
 {'j','k','l'},{'m','n','o'},{'p','q','r','s'},
 {'t','u','v'},{'w','x','y','z'}};
 String n="23";
        Keyboard(n,0,Keys,"");
    }
   
    public static void Keyboard(String n,int i,char Keys[][],String str){
        if(i==n.length()){
            System.out.println(str);
            return;
        }

        char ch=n.charAt(i);
        char[] letters = Keys[Character.getNumericValue(n.charAt(i))];
        for(int j=0;j<letters.length;j++){
            Keyboard(n, i+1, Keys, str+letters[j]);
        }
        return;
    }
    
}
