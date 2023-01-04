package Java_Advanced.code_with_bs;

public class KeyValue <K,V> {
    private K key;
    private V value;
    public KeyValue(K key,V value){
        this.key=key;
        this.value=value;
    }
    public void printing(){
        System.out.println(this.key+"is"+this.value);
    }
    
}
