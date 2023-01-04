package Java_Advanced.DataStructurenAlgorithms.LinkedList;

public class Node <T>{
    private T value;
    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    private Node next;
    
    public Node(T value){
        this.value=value;
    }
}
