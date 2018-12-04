public class ArraySort {

    public static void main(String args[]) {
        int[] arr = {5, 7, 8, 6,3};
//        bubbleSort(arr);


//        quickSort(arr, 0, arr.length - 1);

        mergeSort(arr,0,arr.length - 1);

        for (int i : arr) {
            System.out.println(i);
        }

    }

    /**
     * @冒泡排序
     * @思路:其大体思想就是通过与相邻元素的比较和交换来把小的数交换到最前面
     * @时间复杂度 O(N ^ 2)
     */
    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                }
            }

        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * @param arr
     * @快速排序
     * @思路:快速排序一听名字就觉得很高端，在实际应用当中快速排序确实也是表现最好的排序算法。快速排序虽然高端，但其实其思想是来自冒泡排序，
     * @冒泡排序是通过相邻元素的比较和交换把最小的冒泡到最顶端，而快速排序是比较和交换小数和大数，这样一来不仅把小数冒泡到上面同时也把大数沉到下面。
     * @时间复杂度(最优:nlogn 最差:n^2)
     */

    private static void quickSort(int[] arr, int start, int end) {
        if (arr.length <= 1 || start >= end) return;
        int low = start;
        int high = end;
        int mid = arr[start];
        /*每次循环先从右至左遍历，找到比基准元素小的第一个元素，
         * 然后从左至右遍历，找到比基准元素大的第一个元素，
         * 最后交换两个元素的位置，循环终止时left==right，
         * 且right指向最后一个小于该基准元素的位置
         */
        while (low < high) {
            while (low < high && arr[high] >= mid) high--;
            while (low < high && arr[low] <= mid) low++;
            swap(arr, low, high);

        }
        swap(arr, start, high);
        quickSort(arr, start, high - 1);
        quickSort(arr, high + 1, end);


    }


    private static void mergeSort(int[] arr, int low, int high)
    {
        //使用递归的方式进行归并排序，所需要的空间复杂度是O（N+logN）
        int mid = (low + high)/2;
        if(low < high)
        {
            //递归地对左右两边进行排序
            mergeSort(arr, low, mid);
            mergeSort(arr, mid+1, high);
            //合并
            merge(arr, low, mid, high);
        }
    }

    //merge函数实际上是将两个有序数组合并成一个有序数组
    //因为数组有序，合并很简单，只要维护几个指针就可以了
    private static void merge(int[] arr, int low, int mid, int high)
    {
        //temp数组用于暂存合并的结果
        int[] temp = new int[high - low + 1];
        //左半边的指针
        int i = low;
        //右半边的指针
        int j = mid+1;
        //合并后数组的指针
        int k = 0;

        //将记录由小到大地放进temp数组
        for(; i <= mid && j <= high; k++)
        {
            if(arr[i] < arr[j])
                temp[k] = arr[i++];
            else
                temp[k] = arr[j++];
        }

        //接下来两个while循环是为了将剩余的（比另一边多出来的个数）放到temp数组中
        while(i <= mid)
            temp[k++] = arr[i++];

        while(j <= high)
            temp[k++] = arr[j++];

        //将temp数组中的元素写入到待排数组中
        for(int l = 0; l < temp.length; l++)
            arr[low + l] = temp[l];
    }

}
