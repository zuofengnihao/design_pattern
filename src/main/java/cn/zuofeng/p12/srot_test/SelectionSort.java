package cn.zuofeng.p12.srot_test;

/**
 * @Auther: ZuoFeng
 * @Date: 2022/4/13 16:31
 * @Description:
 */
public class SelectionSort implements ISort {
    @Override
    public void sort(int[] arr) {
        int minIndex;
        for (int i = 0; i < arr.length - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                // 记录最小值的下标
                if (arr[minIndex] > arr[j]) minIndex = j;
            }
            // 将最小元素交换至首位
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
