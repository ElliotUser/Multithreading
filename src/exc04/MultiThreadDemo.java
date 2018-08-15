package exc04;

public class MultiThreadDemo {
    public static void main(String[] args) {
        NewThread ob1 = new NewThread("One");
        NewThread ob2 = new NewThread("Two");
        NewThread ob3 = new NewThread("Three");

        ob1.thread.start();
        ob2.thread.start();
        ob3.thread.start();


        try {
            Thread.sleep(10000);
        }catch(InterruptedException e){
            System.out.println("Главный поток прерван");
        }
        System.out.println("Главный поток завершен.");
    }
}
