public class KepadCombination {
    public static void main(String[] args) {
        String Key[]={".", "abc","def" ,"ghi","jkl","mno","pqrs","tu","vwx" ,"yz"};
        String str="23";
        Keypad(str,Key,0,"");
    }
    public static void Keypad(String str, String [] key ,int i,String newstr){

if(i==str.length()){
    System.out.println(newstr);
    return;
}
        char ch=str.charAt(i);
        String mapped=key[ch-'0'];
        for(int j=0;j<mapped.length();j++){
            Keypad(str, key, i+1,newstr+mapped.charAt(j));
        }
    }
}
