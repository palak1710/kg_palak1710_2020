//Java program 
import java.util.*;
import java.io.*;

public class main {

    public static void main(String[] args){

        boolean flag=false;

        //Getting input from command line arguments
        String s = args[0];
        String t = args[1];

        //Edge case if string is null or of size 1
        if(s == null || s.length() <= 1) {
            flag=true;
            System.out.println(flag);
            return;
        }

        //Used hashmap to store the one-to-one mapping of strings
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        //Iterating through the strings
        for(int i = 0 ; i< s.length(); i++){
            char a = s.charAt(i);
            char b = t.charAt(i);
            //Checking if the mapping exists
            if(map.containsKey(a)){
                //To check if the value in the hashmap is same as the character in the string
                if(map.get(a).equals(b))
                continue;
                else{
                    //The mapping does not exist
                   flag=false;
                   System.out.println(flag);
                   return;
                }
                
            }else{
                //Add the mapping if it does not exist
                if(!map.containsValue(b))
                map.put(a,b);
                
            }  
        }
    
        flag=true;
        System.out.println(flag);
    }   
    }