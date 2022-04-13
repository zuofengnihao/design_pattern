package cn.zuofeng.p12.srot_test;

/**
 * @Auther: ZuoFeng
 * @Date: 2022/4/13 16:40
 * @Description:
 */
public class Sort implements ISort {

    private ISort sort;

    public Sort(SortStrategy strategy) throws IllegalAccessException {
        this.setSort(strategy);
    }

    public void setSort(SortStrategy strategy) throws IllegalAccessException {
        switch (strategy) {
            case BUBBLE_SORT:
                System.out.println("use bubble sort");
                this.sort = new BubbleSort();
                break;
            case SELECTION_SORT:
                System.out.println("use selection sort");
                this.sort = new SelectionSort();
                break;
            case INSERT_SORT:
                System.out.println("use insert sort");
                this.sort = new InsertSort();
                break;
            default:
                throw new IllegalAccessException("There's no such strategy yet");
        }
    }

    @Override
    public void sort(int[] arr) {
        this.sort = sort;
    }
}
