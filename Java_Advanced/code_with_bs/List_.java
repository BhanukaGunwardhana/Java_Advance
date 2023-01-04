package Java_Advanced.code_with_bs;

public class List_{
    private int [] items;
    private int count;
    public List_(){
        this.items=new int [10];
        this.count=0;
    }
    public void add(int item){
        items[count++]=item;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
       // return super.toString();
       String a="[";
       for (int i: items){
        a=a+Integer.toString(i)+",";

       }
       return (a+"]");

    }
    public static List_<String> of(int i, int j, int k) {
        return null;
    } 

    
}