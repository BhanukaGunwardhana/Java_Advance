package Java_Advanced.Hackerrank.Tokens;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String s_="@@@gh@k@ ";
        String r_="([^!,?._'@\\s]+.*)";
        Pattern pt=Pattern.compile(r_);
        Matcher mt=pt.matcher(s_);
        if(mt.find()){
            String p=mt.group();
            if(p.length()==0){
                System.out.print(0);
            }else{
            String s=p.trim();
            
            String r="[!,?._'@\\s]+";
            
    
            int count=0;
            for (String i:s.split(r)){
                System.out.println(i);
                count++;
                
            }
            System.out.println(count);
            } 
        }

       /* */
        
       
        
    }
}


//[A-Za-z !,?._'@]