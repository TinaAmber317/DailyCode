package Sort;

public class Shell {
    public int[] shellSort(int[] nums) {
        int gap = nums.length;
        while(gap > 1) {
            gap /= 2;
            shell(nums, gap);
        }
        return nums;
    }

    private static void shell(int[] nums, int gap) {
        for(int i = gap; i < nums.length; i++) {
            int tmp = nums[i];
            int j = i - gap;
            for(; j >= 0; j -= gap) {
                if(nums[j] > tmp) {
                    nums[j+gap] = nums[j];
                } else {
                    nums[j+gap] = tmp;
                    break;
                }
            }
            nums[j+gap] = tmp;
        }
    }
}
