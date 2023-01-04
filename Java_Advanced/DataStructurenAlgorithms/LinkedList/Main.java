package Java_Advanced.DataStructurenAlgorithms.LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Java_Advanced.DataStructurenAlgorithms.LinkedList.LinkedList list=new Java_Advanced.DataStructurenAlgorithms.LinkedList.LinkedList<Integer>();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        //list.addMiddle(1, "S");
        list.printList();
        //System.out.println(list.contains(2)); 
        //System.out.println(list.getSize());
        list._reverse();
        
        Object[] arr= list.toArray();

        System.out.println(Arrays.toString( arr));
        //list.deleteMiddle(1);
        //list.printList();

        

       // String s =scan.toString();
       //String s=scan.next();
       

        

        // Write your code here.
        
    }
}
