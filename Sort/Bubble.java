package Sort;

public class Bubble {
    public int[] bubbleSort(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            boolean flg = false;
            for(int j = 0; j < nums.length-1-i; j++) {
                if(nums[j+1] < nums[j]) {
                    int tmp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = tmp;
                    flg = true;
                }
            }
            if(!flg) {
                break;
            }
        }
        return nums;
    }
}
