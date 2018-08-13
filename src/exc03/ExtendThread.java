package exc03;

public class ExtendThread {
    public static void main(String[] args) {
        new NewThread();

        try {
            for(int i = 7; i > 0; i--) {
                System.out.println("Главный поток: "+i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println("Главный поток прерван.");
        }
        System.out.println("Главный поток завершен.");
    }
}
