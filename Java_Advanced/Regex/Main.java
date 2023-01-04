package Java_Advanced.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        /*String p="^(\\d*)(\\s\\w*\\s\\w*\\s)(\\d*)$";
        String input="10 divided by 2";
        Pattern pt= Pattern.compile(p);
        Matcher mt= pt.matcher(input);
        boolean bool= mt.find();
        System.out.println(bool);
        if(bool){
            String result=mt.group(1)+"/"+mt.group(3);
            System.out.println(result);
        }*/
        //String p="^(\\d{1,4}).(\\d{1,4}).(\\d{1,4}).(\\d{1,4})$";
        //String p="^(\\d{1,4})[.](\\d{1,4})[.](\\d{1,4})[.](\\d{1,4})$";
        //String p="^([0-9]{1}|[0-9]{1}[0-9]{1}|[0-2]{1}[0-4]{1}[0-9]{1}|[0-1]{1}[5]{1}[0-9]{1}|[2]{1}[5]{1}[0-5]{1})[.]([0-9]{1}|[0-9]{1}[0-9]{1}|[0-2]{1}[0-5]{1}[0-5]{1})[.]([0-9]{1}|[0-9]{1}[0-9]{1}|[0-2]{1}[0-5]{1}[0-5]{1})[.]([0-9]{1}|[0-9]{1}[0-9]{1}|[0-2]{1}[0-5]{1}[0-5]{1})$";
        String p="^([0-9]{1}|[0-9]{1}[0-9]{1}|[0-2]{1}[0-4]{1}[0-9]{1}|[0-1]{1}[5]{1}[0-9]{1}|[2]{1}[5]{1}[0-5]{1})[.]([0-9]{1}|[0-9]{1}[0-9]{1}|[0-2]{1}[0-4]{1}[0-9]{1}|[0-1]{1}[5]{1}[0-9]{1}|[2]{1}[5]{1}[0-5]{1})[.]([0-9]{1}|[0-9]{1}[0-9]{1}|[0-2]{1}[0-4]{1}[0-9]{1}|[0-1]{1}[5]{1}[0-9]{1}|[2]{1}[5]{1}[0-5]{1})[.]([0-9]{1}|[0-9]{1}[0-9]{1}|[0-2]{1}[0-4]{1}[0-9]{1}|[0-1]{1}[5]{1}[0-9]{1}|[2]{1}[5]{1}[0-5]{1})[.]$";
        //String p="^age.\\d{2}.age.\\d$";
        //String input="age.12.age.3"; 
        String e="([0-9]{1}|[0-9]{1}[0-9]{1}|[0-2]{1}[0-4]{1}[0-9]{1}|[0-2]{1}[0-5]{1}[0-5]{1})";
        String pattern="^"+e+"[.]"+e+"[.]"+e+"[.]"+e+"$";
        Pattern pt= Pattern.compile(pattern);
        //Pattern pt_=Pattern.compile(e, 0)
        String input="249.249.249.256"; 
        Matcher mt= pt.matcher(input);
        boolean bool= mt.find();
        boolean check=false;
        //Pattern.matches(p, input);
       // input.matches(p);
        System.out.println(bool);
       /*  if (bool){
          // System.out.println(mt.group(4));
          for (int i=1;i<=4;i++){
            int value=Integer.valueOf(mt.group(i));
            if(value>=0 && value<=255){
                check=true;

            }else{
                check=false;
            }
          }
        }*/
       // System.out.println(check);
        
    }
}
