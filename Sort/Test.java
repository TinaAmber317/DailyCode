package Sort;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] nums = {-4,0,7,4,9,-5,-1,0,-7,-1};
        Heap heap = new Heap();
        System.out.println("排序前：" + Arrays.toString(nums));
        heap.heapSort(nums);
        System.out.println("排序后：" + Arrays.toString(nums));

    }
}
