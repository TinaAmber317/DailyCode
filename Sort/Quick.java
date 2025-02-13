package Sort;

public class Quick {
    public void quickSort(int[] nums, int start, int end) {
        if(start >= end) {
            return;
        }
        int pivot = paritition(nums, start, end);
        quickSort(nums, start, pivot-1);
        quickSort(nums, pivot+1, end);
    }

    public int paritition(int[] nums, int left, int right) {
        //记录开始的位置
        int index = left;
        int tmp = nums[left];
        while(left != right) {
            while(left < right && nums[right] > tmp) {
                right--;
            }
            while(left < right && nums[left] <= tmp) {
                left++;
            }

            int swap = nums[left];
            nums[left] = nums[right];
            nums[right] = swap;
        }
        //最后交换一次结束的值与开始的值
        nums[index] = nums[left];
        nums[left] = tmp;
        return left;
    }
}
