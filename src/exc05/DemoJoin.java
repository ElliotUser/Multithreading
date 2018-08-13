package exc05;

public class DemoJoin {
    public static void main(String[] args) {
        NewThread ob1 = new NewThread("One");
        NewThread ob2 = new NewThread("Two");
        NewThread ob3 = new NewThread("Three");

        System.out.println("Поток One запущен: "+ob1.getThread().isAlive());
        System.out.println("Поток Two запущен: "+ob2.getThread().isAlive());
        System.out.println("Поток Three запущен: "+ob3.getThread().isAlive());

        try {
            System.out.println("Ожидание завершения потоков.");
            ob1.getThread().join();
            ob2.getThread().join();
            ob3.getThread().join();
        }catch(InterruptedException e){
            System.out.println("Главный поток прерван");
        }

        System.out.println("Поток One запущен: "+ob1.getThread().isAlive());
        System.out.println("Поток Two запущен: "+ob2.getThread().isAlive());
        System.out.println("Поток Three запущен: "+ob3.getThread().isAlive());

        System.out.println("Главный поток завершен.");
    }
}
