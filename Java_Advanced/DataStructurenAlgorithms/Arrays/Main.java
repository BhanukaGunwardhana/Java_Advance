package Java_Advanced.DataStructurenAlgorithms.Arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Array<String> arr=new Array<>();
        arr.insert("A");
        arr.insert("B");
        arr.print();
        arr.delete(0);
        arr.print();
    }
    
}
