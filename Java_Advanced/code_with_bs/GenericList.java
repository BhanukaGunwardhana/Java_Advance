package Java_Advanced.code_with_bs;

import java.util.ListIterator;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class GenericList <T> implements Iterable <T>{
    private T [] items=(T[]) new Object[5];
    //private T[] items=new T[10];
    private int count;
    public GenericList(int size){
        //this.count=0;
       // this.items=(T[]) new Object[size];
    }

    public void add(T item){
        items[count]=item;
        count++;
    }
    public T get(int index){
        return items[index];

    }
    @Override
    public java.util.Iterator<T> iterator() {
        // TODO Auto-generated method stub
        return new ListIterator<>(this);
    }
    public class ListIterator<T> implements java.util.Iterator<T>{
        private GenericList<T> genericList;
        private int index;
        public ListIterator(GenericList<T> gList){
            this.genericList=gList;
            //this.index=0;
            
        }

        @Override
        public boolean hasNext() {
            // TODO Auto-generated method stub
            return (index<= this.genericList.count-1);
        }

        @Override
        public T next() {
            // TODO Auto-generated method stub
            T a=this.genericList.items[index];
            index++;
            return a;

        }

    }

    
}
