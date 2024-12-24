import java.util.*;
public class DuplicatesString {
    public static void main(String[] args) {
        String str="adityapatel";
        Duplicate(str,new String(""), new boolean[26],0);
    }

// By String Builder
    // public static void Duplicate(String str , StringBuilder newstr,boolean map[] ,int i){
    //     if(i==map.length){
    //         System.out.println(newstr);
    //         return ;
    //     }


    //     char ch=str.charAt(i);
    //     if(map[ch -'a']==true){
    //         Duplicate(str, newstr, map, i+1);
    //     }
    //     else{
    //         map[ch -'a']=true;
    //             Duplicate(str, newstr.append(ch), map, i+1);
            
    //     }
    // }


    //  by String Class
    public static void Duplicate(String str , String newstr,boolean map[] ,int i){
        if(i==str.length()){
            System.out.println(newstr);
            return ;
        }


        char ch=str.charAt(i);
        if(map[ch -'a']==true){
            Duplicate(str, newstr, map, i+1);
        }
        else{
            map[ch -'a']=true;
                Duplicate(str, newstr+=ch, map, i+1);
            
        }
    }
}
