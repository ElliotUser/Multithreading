package exc05ОШИБКА;

public class DemoJoin {
    public static void main(String[] args) {
        NewThread ob1 = new NewThread("One");
        NewThread ob2 = new NewThread("Two");
        NewThread ob3 = new NewThread("Three");

        ob1.t.start();
        ob2.t.start();
        ob3.t.start();

        System.out.println("Поток One запущен: "+ob1.t.isAlive());
        System.out.println("Поток Two запущен: "+ob2.t.isAlive());
        System.out.println("Поток Three запущен: "+ob3.t.isAlive());

        try {
            System.out.println("Ожидание завершения потоков.");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }catch(InterruptedException e){
            System.out.println("Главный поток прерван");
        }

        System.out.println("Поток One запущен: "+ob1.t.isAlive());
        System.out.println("Поток Two запущен: "+ob2.t.isAlive());
        System.out.println("Поток Three запущен: "+ob3.t.isAlive());

        System.out.println("Главный поток завершен.");
    }
}
