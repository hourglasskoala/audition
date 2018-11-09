import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Apple {
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static void main(String args[]) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Apple apple = new Apple();
        apple.setPrice(5);
        System.out.println(apple.getPrice());

        Class cls = Class.forName("Apple");
        Method setPrice = cls.getMethod("setPrice", int.class);
        Constructor<Apple> constructor = cls.getConstructor();
        Object obj = constructor.newInstance();
        setPrice.invoke(obj, 14);
        Method getPrice = cls.getMethod("getPrice");
        System.out.println(getPrice.invoke(obj));
    }
}
