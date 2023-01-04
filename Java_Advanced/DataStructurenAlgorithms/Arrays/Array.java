package Java_Advanced.DataStructurenAlgorithms.Arrays;

public class Array<T> {
    //private <T> [] arr=new <T> [0];
    //private int [] a=new int[9];
    private T [] arr=(T[]) new Object[0];
    private int count;

    public T[] getArr() {
        return arr;
    }
    public void setArr(T[] arr) {
        this.arr = arr;
    }
    public void insert(T input){
        T [] arr1=(T[]) new Object[this.arr.length+1];

        int index=0;
        for (T i: this.arr){

            arr1[index]=i;
            index++;
        }
        arr1[index]=input;
        this.arr=arr1;
        count++;
     }
     public void remove(T input){
        T [] arr1=(T[]) new Object[this.arr.length-1];
        int index=0;
        Boolean checkfor1st=false;
        for (T i:arr){
            if(i.equals(input) & checkfor1st==false){
                checkfor1st=true;
                continue;
            }else{
                arr1[index]=i;
                index++;
            }
            this.arr=arr1;
        }

     }
     public void delete(int index){

        for (int i=index;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        count--;

     }
     public void print(){
        for(int i=0;i<count;i++){
            System.out.println(arr[i]);
        }
     }
}
