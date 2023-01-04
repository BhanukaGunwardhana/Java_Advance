package Java_Advanced.Lambdaexp_Functionalitfc;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class A implements Consumer{

    @Override
    public void accept(Object t) {
        // TODO Auto-generated method stub
        
        
    }
    public Consumer<String> con=input->System.out.println(input);

    public Predicate<String> bool=(str->str.length()>=5);
    
    
}
