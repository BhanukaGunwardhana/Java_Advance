package Java_Advanced.Streams;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

//import Java_Generics.code_with_bs.List;

public class StreamClass {

    public static void show(){
       // java.util.List<String> list1=Arrays.asList(null);
        //int [] arr={1,2,3};
        //Arrays.stream(arr).filter(i->(i%2)==0).forEach(i->System.out.println(i));

        //Stream.generate(()->Math.random()).limit(4).forEach(i->System.out.println(i));
        //Stream.of(List.of(1,2,3),List.of(4,5,6)).map(list->list[0]).forEach(i->System.out.print(i));
        
        List<List<Integer>> list1=new ArrayList<>();
    
        Stream.of(Arrays.asList(1,2,3),Arrays.asList(4,5,6)).flatMap(list->list.stream()).forEach(i->System.out.println(i));


    }
    
    
    
    
}
