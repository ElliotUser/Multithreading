package exc06;

public class Synch {
    public static void main(String[] args) {
        Callme target = new Callme();
        Caller ob1 = new Caller(target,"Добро пожаловать");
        Caller ob2 = new Caller(target,"в синхронизованный");
        Caller ob3 = new Caller(target,"мир!");

        try {
            ob1.thread.join();
            ob2.thread.join();
            ob3.thread.join();
            System.out.println(ob1.thread.getPriority());
            System.out.println(ob2.thread.getPriority());
            System.out.println(ob3.thread.getPriority());
        }catch(InterruptedException e){
            System.out.println("Прервано");
        }
    }
}
