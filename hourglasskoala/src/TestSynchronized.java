public class TestSynchronized implements Runnable {
    static int num;

    private synchronized void increase() {
        System.out.println(num++);
    }

    @Override
    public void run() {
        for (int i = 0; i < 20000; i++) {
            increase();
        }
    }

    public static void main(String args[]) {
        TestSynchronized testSynchronized = new TestSynchronized();
        Thread thread1 = new Thread(testSynchronized);
        Thread thread2 = new Thread(testSynchronized);
        thread1.start();
        thread2.start();
    }
}
