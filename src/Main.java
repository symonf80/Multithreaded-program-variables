public class Main {
    public static volatile boolean selector;

    public static void main(String[] args) {
        User user = new User();
        Box box = new Box();
        Thread threadUser = new Thread(user);
        threadUser.setName("Пальчик");
        Thread threadBox = new Thread(box);
        threadBox.setName("Кто-то из коробки");
        threadUser.start();
        threadBox.start();
        try {
            threadUser.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Все," + threadUser.getName() + " устал.. Заканчиваю..");
        threadBox.interrupt();
    }
}
