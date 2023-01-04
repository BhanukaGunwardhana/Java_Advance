package Java_Advanced.code_with_bs;

import java.util.Comparator;

public class AgeComparator implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {
        // TODO Auto-generated method stub
        return Integer.valueOf(o1.getAge()).compareTo(Integer.valueOf((o2.getAge()))) ;
    }
    
    
}
