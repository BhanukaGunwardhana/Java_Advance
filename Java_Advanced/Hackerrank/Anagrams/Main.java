package Java_Advanced.Hackerrank.Anagrams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    static boolean isAnagram(String a_, String b_) {
        String a=a_.toLowerCase();
        String b=b_.toLowerCase();
       // b.s
        String [] arr=new String[2];
        List<String> ls=new ArrayList<>();
        arr[0]=a;
        arr[1]=b;
        // Complete the function
        if(a.length()==b.length()){
            
            for (String s: arr){
                Set<Character> set=new HashSet<>();
                for (int i=0;i<s.length();i++){
                    set.add(s.charAt(i));
                }
                List<Character> list=new ArrayList<>();
                for (Character i:set){
                    for(int j=0;j<s.length();j++){
                        if(i==s.charAt(j)){
                            list.add(i);
                        }/*else if(String.valueOf(i)==String.valueOf(s.charAt(j)).toUpperCase()){
                            list.add(i);
                        }else if(String.valueOf(i)==String.valueOf(s.charAt(j)).toLowerCase()){
                            list.add(i);
                        }*/


                    }
                }
                Collections.sort(list);
                String g="";
                for (Character i:list){
                    g=g+i;
                }
                //g=g.toLowerCase();
                ls.add(g);
                
            }
            if(ls.get(0).equals(ls.get(1))){
                return true;
            }else{
                return false;
            }
            
            

            }
            
            
        
        else{
            return false;
        }
        
    }
    public static void main(String[] args) {
        System.out.println(Main.isAnagram("Hello", "hello"));
    }
}
    
//anagramm
//marganaa