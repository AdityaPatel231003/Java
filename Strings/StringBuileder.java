public class StringBuileder {
    public static void main(String[] args) {
        // for memory efficiency
        String str="hello";
        System.out.println(add(str));
        System.out.println(stringB(str));
    }
    public  static String  add(String str){
        // O(x*n) =>O(n^2)
        String newstr=" ";
        for(char ch='a';ch<='z';ch++){
            newstr+=ch;
        }
        return newstr;
    }
    public  static String stringB(String str){
        // O(x=length of String =26) +> O(n)
        StringBuilder sb=new StringBuilder("");
        for(char ch='a';ch<='z';ch++){
            sb.append(ch);
        }
       

        return sb.toString();
    }
    
}
