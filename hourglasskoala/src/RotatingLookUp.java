/**
 * @desc 给出一个数组{1,3,4,6,7,9,11}，它的旋转数组可以是{4,6,7,9,11,1,3}
 * 已知原始数组是递增的，旋转数组由原始数组变形而来，查找该旋转数组中某个元素是否存在。
 */

public class RotatingLookUp {
    /**
     * @desc 方法一
     * 顺序查找 逻辑复杂度
     */

    private static int search(int[] intArr, int key, int length) {
        for (int i = 0; i < length; i++) {
            if (key == intArr[i]) {
                return i + 1;
            }
        }
        return -1;
    }

    /**
     * @desc 方法二
     * 顺序查找 逻辑复杂度
     */
    private static int searchRotated(int[] intArr, int key, int length) {
        int left = 0;
        int right = length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (key == intArr[mid]) {
                return mid + 1;
            } else if (intArr[mid] < intArr[right]) {
                if (key > intArr[mid] && key <= intArr[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else {
                if (key > intArr[mid] && key <= intArr[left]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return -1;
    }


    public static void main(String args[]) {
        int[] intArr = {4, 6, 7, 9, 11, 1, 3};
//        System.out.println(search(intArr, 6, intArr.length));

        System.out.println(searchRotated(intArr, 11, intArr.length));
    }


}
