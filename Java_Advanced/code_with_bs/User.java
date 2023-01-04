package Java_Advanced.code_with_bs;

public class User implements Comparable<User> {
    
    private String name;
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {



        
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public User(String name, int age){
        this.name=name;
        this.age=age;
    }
    @Override
    public int compareTo(User o) {
        // TODO Auto-generated method stub
        return this.name.compareTo(o.name);
    }
    @Override
    public String toString() {
        return "User [name=" + name + ", age=" + age + "]";
    }
    
    


}
