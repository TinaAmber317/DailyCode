package Sort;

public class Select {
    public int[] selectSort(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            int minIndex = i;
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            if(i != minIndex) {
                int tmp = nums[i];
                nums[i] = nums[minIndex];
                nums[minIndex] = tmp;
            }
        }
        return nums;
    }
}
