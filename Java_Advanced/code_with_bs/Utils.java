package Java_Advanced.code_with_bs;

public class Utils<T> {
    public static <T extends Comparable> T max(T first,T second){
        return (first.compareTo(second)>=0)?first:second;
    }
    public static void method(GenericList<?> list){
        System.out.println(list.get(0));
    }
}
