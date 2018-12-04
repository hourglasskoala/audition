/**
 * @desc 打印出所有的 "水仙花数 "，所谓 "水仙花数 "是指一个三位数，其各位数字立方和等于该数本身。 例如：153是一个 "水仙花数，因为153=1的三次方＋5的三次方＋3的三次方。
 * 分析：将各位数取出后进行Math.pow(x,3)并求和如果等于原始数即为水仙花数
 */
public class DaffodilTree {

    public static void main(String args[]) {
        for (int i = 101; i < 301; i++) {
            if (i == math(i)) {
                System.out.println(i);
            }
        }

    }

    public static int math(int baseNum) {
        int one = baseNum % 100 % 10;
        int two = baseNum % 100 / 10;
        int three = baseNum / 100;

        return (int) (Math.pow(one, 3) + Math.pow(two, 3) + Math.pow(three, 3));
    }
}
