package Java_Advanced;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import Java_Advanced.Concurrency.ThreadDemo;
import Java_Advanced.Lambdaexp_Functionalitfc.A;
import Java_Advanced.Lambdaexp_Functionalitfc.LambdaDemo;
import Java_Advanced.Streams.StreamClass;
import Java_Advanced.code_with_bs.AgeComparator;
import Java_Advanced.code_with_bs.GenericList;
import Java_Advanced.code_with_bs.List_;
import Java_Advanced.code_with_bs.User;

public class Main{
    public static void main(String[] args) {

        String s="welcometojava";
        int k=3;
        String smallest = "";
        String largest = "";
        int t=0;
        int to=0;
        int c='z';
        int tmin=k* c;
        //List<String> list=new ArrayList<>();
        //String s="";
        for (int i=0;i<s.length()-k;i++){
            String d="";
            //String max="";
            //String min="";
            for (int j=i;j<i+k;j++){
                d=d+s.charAt(j);
                
                
            }
            //System.out.println(d);
            //int t=0;
            //to=t;
            t=0;
            for (int j=0;j<d.length();j++){
                t=t+ (d.charAt(j));
            }
            if(t>=to){
                largest=d;
                to=t;
               // System.out.println(largest);
                //System.out.println(t);
            }if(t<=tmin){
                smallest=d;
                tmin=t;
            }
        }
        
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        System.out.println(smallest);
        System.out.println(largest); 
        //List list1=new List();
        //list1.add(4);
        //list1.add(5);

        //GenericList a=new GenericList<Integer>();
        //GenericList<String>s=new GenericList<>(2);
        //ArrayList<Integer>b=new ArrayList<>();
        //s.add("Hi");
        //s.add("Bi");
        //System.out.println(s.get(0));

        //int a=Utils.max(1, 5);
        //KeyValue<String,Integer> map=new KeyValue<>("Pradeep", 1);
        //map.printing();

        /*for (String i:s){
            System.out.println(i);
        }
        
        ArrayList <User> userList=new ArrayList<>();
        userList.add(new User("Vimukthi", 35));
        userList.add(new User("Kalana", 28));
        userList.add(new User("Dinuka", 27));
        Collections.sort(userList);
        Collections.sort(userList, new AgeComparator());
        System.out.println(userList);*/

       


       /* GenericList<User> userList_=new GenericList<>(3);
        userList_.add(new User("Vimukthi", 35));
        userList_.add(new User("Kalana", 28));
        userList_.add(new User("Dinuka", 27));
        Collections.sort((userList_);*/

        //LambdaExpression
       /*LambdaDemo.show();
       
       LambdaDemo a=new LambdaDemo();
       a.area.accept(3.0);

       new A().con.accept("TT");
       Boolean bool2= new A().bool.test("ghfuirwphvioefhb");
       System.out.println(bool2);*/

       //Stream
       //StreamClass.show();


       //Concurrency
       // ThreadDemo threadobj=new ThreadDemo();
        //threadobj.show();
}
}