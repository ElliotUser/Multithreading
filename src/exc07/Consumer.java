package exc07;

public class Consumer implements Runnable {
    Q q;
    Thread t;

    public Consumer(Q q){
        this.q = q;
        t = new Thread(this,"Потребитель");
    }


    @Override
    public void run() {
        while(true){
            q.get();
        }
    }
}
