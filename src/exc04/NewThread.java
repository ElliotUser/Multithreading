package exc04;

public class NewThread implements Runnable {
    String name;
    Thread thread;

    public NewThread(String threadName){
        name = threadName;
        thread = new Thread(this,name);
        System.out.println("Новый поток: "+thread);
        thread.start();
    }

    @Override
    public void run() {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println(name+": "+i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println(name+" прерван");
        }
        System.out.println(name+" завершен.");
    }
}
