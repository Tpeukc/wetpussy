import java.util.LinkedList;
import java.util.List;

/**
 * Created by YurievAP on 07.06.2017.
 */
public class BlockingQueue {

    private List queue = new LinkedList();
    private int  limit = 10;

    public BlockingQueue(int limit){
        this.limit = limit;
    }


    public synchronized void put(Object item) throws InterruptedException  {
        System.out.println("[BlockingQueue] try to put: " + item );
        while (this.queue.size() == this.limit) {
            System.out.println("[BlockingQueue] queue is full, waiting until space is free");
            wait();
        }
        if (this.queue.size() == 0) {
            System.out.println("[BlockingQueue] queue is empty, notify");
            notifyAll();
        }
        this.queue.add(item);
        System.out.println("[BlockingQueue] put ok: " + item );
    }


    public synchronized Object take() throws InterruptedException{
        System.out.println("[BlockingQueue] try to take");
        while (this.queue.size() == 0){
            System.out.println("[BlockingQueue] queue is empty, waiting until smth is put");
            wait();
        }
        if (this.queue.size() == this.limit){
            System.out.println("[BlockingQueue] queue is full, notify");
            notifyAll();
        }

        Object item = this.queue.remove(0);
        System.out.println("[BlockingQueue] take ok: " + item );
        return item;
    }
}
