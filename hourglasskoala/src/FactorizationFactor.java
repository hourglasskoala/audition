import java.util.Scanner;

/**
 * @desc 将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。
 */
public class FactorizationFactor {
    private static StringBuffer sb = new StringBuffer();

    public static void main(String args[]) {
        System.out.println(Math.pow(2,10));
        Scanner scanner = new Scanner(System.in);
        String numString = scanner.next();
        int baseNum = Integer.parseInt(numString);
        sb.append(baseNum + "=");
        calculate(baseNum);
    }

    public static void calculate(int num) {
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                if (i == num) {
                    sb.append(i);
                } else {

                    sb.append(i + "*");
                }
                calculate(num / i);
            }
        }
        System.out.println(sb.toString());
        System.exit(0);
    }
}
