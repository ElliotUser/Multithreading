package exc03;

public class NewThread extends Thread {
    public NewThread(){
        super("Демонстрационный поток: ");
        System.out.println("Дочерний поток: "+ this);
        start();
    }

    @Override
    public void run(){
        try {
            for(int i = 7; i > 0; i--) {
                System.out.println("Дочерний поток: "+i);
                Thread.sleep(500);
            }
        }catch(InterruptedException e){
            System.out.println("Дочерний поток прерван.");
        }
        System.out.println("Дочерний поток завершен.");
    }
}
