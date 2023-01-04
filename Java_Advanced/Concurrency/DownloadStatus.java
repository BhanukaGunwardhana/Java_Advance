package Java_Advanced.Concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class DownloadStatus {
   // private int downloadByte;
    private AtomicInteger downloadByte=new AtomicInteger();
    private Object obj=new Object();
    private Object obj_2=new Object();
    private boolean isDone;

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean isDone) {
        {this.isDone = isDone;}
        
    }

    public int getDownloadByte() {
        return downloadByte.get();
    }

    public void setDownloadByte(AtomicInteger downloadByte) {
        this.downloadByte = downloadByte;
    }

    public void increment(){
        downloadByte.incrementAndGet();
        
    }
    
}
