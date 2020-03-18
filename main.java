import java.util.*;
import java.io.*;

public class main {

    public static void main(String[] args){

        boolean flag=false;

        String s = args[0];
        String t = args[1];

        if(s == null || s.length() <= 1) {
            flag=true;
            System.out.println(flag);
            return;
        }
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        for(int i = 0 ; i< s.length(); i++){
            char a = s.charAt(i);
            char b = t.charAt(i);
            if(map.containsKey(a)){
                 if(map.get(a).equals(b))
                continue;
                else{
                   flag=false;
                   System.out.println(flag);
                   return;
                }
                
            }else{
                if(!map.containsValue(b))
                map.put(a,b);
                
                
            }
           
        }
    
        flag=true;
        System.out.println(flag);
    }

       
    }