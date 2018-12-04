import java.util.ArrayList;
import java.util.List;

/**
 * 实现一个容器,提供两个方法 add size
 * 写两个线程，线程1添加10个元素到容器中，线程2实现监控元素的个数，当个数到5个时，线程2给出提示并结束
 */
public class MyContainer {

    private List<String> container = new ArrayList<String>();

    private void add(String s) {
        container.add(s);
    }

    private int size() {
        return container.size();
    }

    public static void main(String args[]) {
        MyContainer myContainer = new MyContainer();



        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    myContainer.add(String.valueOf(i));
                }
            }
        })
    }

}
