package Java_Advanced.DataStructurenAlgorithms.LinkedList;

import java.util.ArrayList;
import java.util.List;

public class LinkedList <T>{
    private Node first;
    private Node last;
    private int size;

    public void addLast(T value ){
        Node node=new Node(value);
        if(this.first==null){
            this.first=node;
            this.last=node;
            
        }else{
            this.last.setNext(node);
            this.last=node;
        }
        this.size++;
    }
    public void addFirst(T value){
        Node node=new Node(value);
        if(this.first==null){
            this.first=node;
            this.last=node;
            
        }else{
            node.setNext(this.first);
            this.first=node;
        }
        this.size++;

    }
    public int getIndex(int index2){
        Node currentNode=this.first;
        int index=0;
        while(currentNode.getNext()!=null){
            if(Integer.valueOf(index2).equals(currentNode.getValue()) ){
                return index;
            }
            index++;
            currentNode=currentNode.getNext();
        }
        return -1;
    }
    public void addMiddle(int index,T value){
        int index_=0;
        Node currentNode=this.first;
        if(currentNode.equals(null)){System.out.println("Empty List");return ;}
        else{
            while(currentNode.getNext()!=null){
                if(first==last){System.out.println("Has one element");return;}
                if(index-1==index_){
                  Node node=new Node<T>(value);
                  Node retainNode=currentNode.getNext();
                  currentNode.setNext(node);
                  node.setNext(retainNode);
                }
    
    
                index_++;
                currentNode=currentNode.getNext();
            }
            size++;
        }
        
    }
    public void deleteMiddle(int index){
        int index_=0;
        Node currentNode=this.first;
        if(currentNode==null){
            System.out.println("List is empty");
            return;
        }
        while(currentNode!=null){
            if(first==last){
                System.out.println("list has only one element");
                return;}
            if(index-1==index_){
                
                final Node removeNode;
                final Node retainNode;
                removeNode=currentNode.getNext();
                retainNode=removeNode.getNext();
                currentNode.setNext(retainNode);
                removeNode.setNext(null);
                break;


            }
            index_++;
            currentNode=currentNode.getNext();
        }
        size--;
        

    }
    public void deleteLast(){
        Node currentNode=this.first;
        if(currentNode.equals(null)){System.out.println("Empty list");return ;}
        else{
            while(currentNode!=null){
                if(first==last){this.first=null;this.last=null;break;}
                else{
                    if(currentNode.getNext().equals(last)){
                        currentNode.setNext(null);
                        last=currentNode;
                    }
                }
            }
            size--;
        }
        

    }

    public void printList(){
        Node currentNode=this.first;
        while(currentNode!=null){
            System.out.println(currentNode.getValue());
            currentNode=currentNode.getNext();
        }
    }
    public boolean contains(int index){
       /*  Node currentNode=this.first;
        int index_=0;
        while(currentNode!=null){
            if(index==index_){
                return true;
            }else{
                index_++;
                currentNode=currentNode.getNext();
            }
           

        }
        return false;*/
        return getIndex(index)!=-1;


    }
    public int getSize(){
        return this.size;
    }
    public T [] toArray(){  
        T [] arr=(T []) new Object[size];
        Node currentNode=this.first;
        int index=0;
        while(currentNode!=null){
            arr[index]=(T) currentNode.getValue();
            index++;
            currentNode=currentNode.getNext();
        }
        return arr;
    }
    public void reverse(){
        Node currentNode=first;
        Node [] arr=new Node [size];
        int index=0;
        while(currentNode!=null){
            Node node=new Node(currentNode.getValue());
            //node.setNext(currentNode.getNext());
            arr[index]=currentNode; 
            currentNode=currentNode.getNext();
            //System.out.println("HI");
            index++;
            
        }
        for(int i=arr.length-1;i>0;i--){
            //System.out.println(arr[i].getValue());
            arr[i].setNext(arr[i-1]);

        }
        //first.setNext(null);
        first=arr[arr.length-1];
        //first.setNext(null);
        last=arr[0];
        last.setNext(null);
    }
    public void _reverse(){
        Node c=first;
        Node retain=first;
        Node p=first;
        Node n;
        //Node z;
        while(c!=null){
            if(c.equals(first)){
                c=c.getNext();
                continue;
            }else{
                n=c.getNext();
                c.setNext(p);
                p=c;
                c=n;

            }

            
            


        }
        this.last=retain;
        this.first=p;
        last.setNext(null);
        /*Node check=first;
        Node runnode=first;
        while(runnode!=null){
            check=runnode;
            runnode=runnode.getNext();

        }
        check.setNext(null);
        this.last=check;*/
    }

}