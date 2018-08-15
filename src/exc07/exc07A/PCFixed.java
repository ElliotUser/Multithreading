package exc07.exc07A;

public class PCFixed {
    public static void main(String[] args) {
        Q q = new Q();
        Producer producer = new Producer(q);
        Consumer consumer = new Consumer(q);

        producer.thread.start();
        consumer.thread.start();

        System.out.println("Для остановки нажмите Ctrl-C");

    }
}
