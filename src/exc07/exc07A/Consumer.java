package exc07.exc07A;

public class Consumer implements Runnable {
    Q q;
    Thread thread;

    public Consumer(Q q){
        this.q = q;
        thread = new Thread(this,"Потребитель");
    }


    @Override
    public void run() {
        while(true){
            q.get();
        }
    }
}
