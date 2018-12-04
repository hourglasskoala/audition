/**
 * @desc 判断101-200之间有多少素数，并输出所有素数
 * 如果该数能被2整除即不是素数反之即是素数
 */
public class PrimeNumber {
    public static void main(String args[]) {
        int count = 0;
        int j = 2;
        for (int i = 101; i < 201; i++) {

            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (i == j) {
                System.out.println(String.format("素数:%s", String.valueOf(i)));
                count++;
            }

        }
        System.out.println(count);


    }

}
