import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.*;

public class FirstThread {
    public static void main(String[] args) throws Exception {
//        ExecutorService executorService = new ThreadPoolExecutor(1, 2, 600L, TimeUnit.SECONDS, new ArrayBlockingQueue(1));
//        executorService.execute(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    Thread.sleep(60000l);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println("=================111");
//            }
//        });
//        executorService.execute(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    Thread.sleep(60000l);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println("=================222");
//            }
//        });
//        executorService.execute(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    Thread.sleep(6000l);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println("=================333");
//            }
//        });
//
//        executorService.execute(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    Thread.sleep(6000l);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println("=================444");
//            }
//        });
//        executorService.shutdown();

        Map<String,String> aa = new HashMap<String, String>();
        System.out.println(1 << 30);
        String bb = "aa";
        System.out.println(bb.hashCode());

    }
}