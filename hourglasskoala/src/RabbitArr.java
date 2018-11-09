/**
 * @desc 裴波那契数列(兔子数列) 1、1、2、3、5、8、13、21、34 F(1)=1，F(2)=1, F(3)=2,F(n)=F(n-1)+F(n-2)
 */
public class RabbitArr {
    public static void main(String args[]) {
        System.out.println(rabbitArr(5));
        System.out.println(1 << 30);
    }

    private static int rabbitArr(int i) {
        if (i == 1 || i == 2) {
            return 1;
        }
        return rabbitArr(i - 1) + rabbitArr(i - 2);
    }
}
