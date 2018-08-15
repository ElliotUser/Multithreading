package exc06ОШИБКА;

public class Caller implements Runnable {
     String msg;
     Callme target;
     Thread thread;

    public Caller(Callme targ, String s){
        target = targ;
        msg = s;
        thread = new Thread(this);
    }

    @Override
    public void run() {
        synchronized(target){
        target.call(msg);
        }
    }

}
