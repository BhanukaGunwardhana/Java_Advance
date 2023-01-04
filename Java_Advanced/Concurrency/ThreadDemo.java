package Java_Advanced.Concurrency;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class ThreadDemo {
    public void show(){
        System.out.println(Thread.currentThread().getName());
        
        //Thread thread=new Thread(new DowloadingFile(status));

        //thread.start();
        /*try {
            thread.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/
        /*try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/
        //thread.interrupt();

       /*  DownloadStatus status=new DownloadStatus();
        List<Thread> threadList=new ArrayList<>();
        //List<DowloadingFile> list_=new ArrayList<>();
        for (int i=0;i<10;i++){
            //DowloadingFile task=new DowloadingFile();
            //list_.add(task);
            Thread thread=new Thread(new DownloadingFile(status));
            thread.start();
            threadList.add(thread);
            
        }
        for (Thread i:threadList){
            try {
                i.join();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }*/
        /* Volatile/AtomicObject/Adder class
        DownloadStatus status=new DownloadStatus();
        Thread thread1=new Thread(new DownloadingFile(status));
        Thread thread2=new Thread(()->{
            while(!status.isDone()){
            synchronized(status){
            try {
                status.wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            }
            }
            if(status.isDone()){
                System.out.println(status.getDownloadByte());
            }
        });
        thread1.start();
        thread2.start(); */

        
        //System.out.println(status.getDownloadByte());
        //System.out.println("Finished");

        //Optional<Integer> statusvalue=list_.stream().map(i->i.getStatus().getDownloadByte()).reduce((a,b)->a+b);
        //System.out.println(statusvalue);

        //Synchronized collections
        /*List<Integer>intlist=Collections.synchronizedList(new ArrayList<>());
        Thread intthread1=new Thread(()->{intlist.addAll(Arrays.asList(1,2,3));});
        Thread intthread2=new Thread(()->{intlist.addAll(Arrays.asList(5,6,7));});
        
        intthread1.start();
        intthread2.start();

        try {
            intthread1.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            intthread2.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println(intlist);*/

        Map<Integer,String> map=new ConcurrentHashMap<>();
        Thread thread1=new Thread(()->map.put(1, "A"));        
        Thread thread2=new Thread(()->map.put(2, "B"));

        thread1.start();
        thread2.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            thread2.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(map);
        
    }
    
}
