package Java_Advanced.Lambdaexp_Functionalitfc;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaDemo {
    //public static  String prefix;
    public static void print(String message){
        System.out.println(message);
    }
    public void print_ins(String message){
        System.out.println(message);
    }
    public LambdaDemo(){}
    public LambdaDemo(String message){
        //System.out.println(message);
    }
    
    public static void show(){
        //String prefix="-";

       //greet(meesage->LambdaDemo.print(meesage));
       //greet(LambdaDemo::print);

       //LambdaDemo demo=new LambdaDemo();

       //greet(message->new LambdaDemo().print_ins(message));
       //greet(new LambdaDemo()::print_ins);
       //greet(demo::print_ins);
       //greet(message ->new LambdaDemo(message));
       //greet(LambdaDemo::new);
    
    
      // greet(System.out::println);

        /*greet(new Printer() {

            @Override
            public void print(String message) {
                // TODO Auto-generated method stub
                System.out.println(message);
            }
            
        });*/

        // Consumer/Consumer chainig

        /*List<Integer> list=Arrays.asList(1,2,3);
        list.forEach(item->System.out.println(item));
        Consumer<Integer> print=(item->System.out.println(item));
        list.forEach(print);*/

        //Consumer Chaining
        
        /*List<String> list_1=Arrays.asList("a","b","c");
        Consumer<String> print_str=(item->System.out.println(item));
        Consumer<String> print_strUpperCase=(item->System.out.println(item.toUpperCase()));    
        list_1.forEach(print_str.andThen(print_strUpperCase));*/
        
        //Supplier
        //Supplier<String> revStr=(()-> "What are you doing??");
        //System.out.println(revStr.get()); 

       //Predicate
       Predicate<String> bool=(str->str.length()>=5);
       System.out.println(bool.negate());

    }
    /*public static void greet(Printer printer){
        printer.print("Hi");
    }*/

    public Consumer<Double> area=(input->System.out.println(input*input));

    
}
