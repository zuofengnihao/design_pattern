package cn.zuofeng.p12.srot_test;

import java.util.Arrays;

/**
 * @Auther: ZuoFeng
 * @Date: 2022/4/13 16:40
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        try {
            int[] arr1 = new int[]{6, 1, 2, 3, 5, 4};
            int[] arr2 = new int[]{6, 1, 2, 3, 5, 4};
            int[] arr3 = new int[]{6, 1, 2, 3, 5, 4};

            Sort sort = new Sort(SortStrategy.BUBBLE_SORT);
            sort.sort(arr1);
            System.out.println(Arrays.toString(arr1));

            sort.setSort(SortStrategy.SELECTION_SORT);
            sort.sort(arr2);
            System.out.println(Arrays.toString(arr2));

            sort.setSort(SortStrategy.INSERT_SORT);
            sort.sort(arr3);
            System.out.println(Arrays.toString(arr3));

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
