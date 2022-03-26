public class User implements Runnable {

    private static final int USER_PAUSE = 3000;
    private static final int ATTEMPT = 5;

    @Override
    public void run() {
        for (int i = 0; i < ATTEMPT; i++) {
            if (!Main.selector) {
                Main.selector = true;
                System.out.println(Thread.currentThread().getName() + " включил переключатель.");
                try {
                    Thread.sleep(USER_PAUSE);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
