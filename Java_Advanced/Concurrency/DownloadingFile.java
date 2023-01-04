package Java_Advanced.Concurrency;

public class DownloadingFile implements Runnable {
    private  DownloadStatus status;
    
    

    public DownloadingFile(DownloadStatus status){
        this.status=status;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println("Downloading file :"+Thread.currentThread().getName());
        //System.out.println("Downloading completed");
        /*try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/
        /*while (true){
            if (Thread.currentThread().isInterrupted()){
                break;
            }
            else{
                System.out.println("Downloading...");
            }
        }*/
        System.out.println("Downloading..");
        for (int i=1;i<=1000;i++){
            
            status.increment();
        }
        status.setDone(true);
        status.notifyAll();

        System.out.println("Downloading completed");
  
    }
    public DownloadStatus getStatus() {
        return status;
    }

    public void setStatus(DownloadStatus status) {
        this.status = status;
    }
    
}
