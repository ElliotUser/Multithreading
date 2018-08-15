package exc07.exc07A;

public class Producer implements Runnable{
    Q q;
    Thread thread;

    Producer(Q q){
        this.q = q;
        thread = new Thread(this,"Поставщик");
    }

    @Override
    public void run() {
        int i = 0;

        while(true){
            q.put(i++);
        }
    }
}
