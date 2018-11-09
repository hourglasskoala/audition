public class ClassLoaderForNameTest {
    public static void main(String args[]) {
        String wholeNameLine = "Line";
        String wholeNamePoint = "Point";
        System.out.println("下面是测试Classloader的效果");
        testClassLoader(wholeNameLine, wholeNamePoint);
        System.out.println("----------------------------------");
        System.out.println("下面是测试Class.forName的效果");
        testForName(wholeNameLine, wholeNamePoint);

    }


    private static void testClassLoader(String class1, String class2) {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        try {
            Class<?> line = classLoader.loadClass(class1);
            Class<?> point = classLoader.loadClass(class2);
            System.out.println("line:===" + line.getName());
            System.out.println("point:===" + point.getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void testForName(String class1, String class2) {
        try {
            Class<?> line = Class.forName(class1);
            Class<?> point = Class.forName(class2);
            System.out.println("line:===" + line.getName());
            System.out.println("point:===" + point.getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}


class Line {
    static {
        System.out.println("静态代码块执行: loading line");
    }
}

class Point {
    static {
        System.out.println("静态代码块执行: loading point");
    }
}
