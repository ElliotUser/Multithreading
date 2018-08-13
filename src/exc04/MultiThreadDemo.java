package exc04;

public class MultiThreadDemo {
    public static void main(String[] args) {
        new NewThread("One");
        new NewThread("Two");
        new NewThread("Three");

        try {
            Thread.sleep(10000);
        }catch(InterruptedException e){
            System.out.println("Главный поток прерван");
        }
        System.out.println("Главный поток завершен.");
    }
}
