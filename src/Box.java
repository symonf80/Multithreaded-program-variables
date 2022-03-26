public class Box implements Runnable {
    private static final int BOX_PAUSE = 1000;

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            if (Main.selector) {
                Main.selector = false;
                try {
                    Thread.sleep(BOX_PAUSE);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " выключил переключатель.");
            }
        }
    }
}
