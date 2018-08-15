package exc06ОШИБКА;

public class Synch {
    public static void main(String[] args) {
        Callme target = new Callme();
        Caller ob1 = new Caller(target,"Добро пожаловать");
        Caller ob2 = new Caller(target,"в синхронизованный");
        Caller ob3 = new Caller(target,"мир!");

        ob1.thread.start();
        ob2.thread.start();
        ob3.thread.start();

        try {
            ob1.thread.join();
            ob2.thread.join();
            ob3.thread.join();

        }catch(InterruptedException e){
            System.out.println("Прервано");
        }
    }
}
