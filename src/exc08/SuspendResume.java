package exc08;

public class SuspendResume {
    public static void main(String[] args) {
        NewThread ob1 = new NewThread("One");
        NewThread ob2 = new NewThread("Two");



        try {
            Thread.sleep(1000);

            ob1.mysuspend();
            System.out.println("Приостановка потока One");
            Thread.sleep(1000);
            ob1.myresume();
            System.out.println("Возобнавление потока One");

            ob2.mysuspend();
            System.out.println("Приостановка потока Two");
            Thread.sleep(1000);
            ob2.myresume();
            System.out.println("Возобнавление потока Two");

        }catch(InterruptedException e){
            System.out.println("Главный поток прерван");
        }
        System.out.println("Главный поток завершен");
    }
}
