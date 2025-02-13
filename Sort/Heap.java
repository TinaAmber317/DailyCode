package Sort;

public class Heap {
    private static void creatHeap(int[] nums) {
        for (int parent = (nums.length - 2) / 2; parent >= 0; parent--) {
            siftDown(nums, parent, nums.length);
        }
    }

    private static void siftDown(int[] nums, int parentIndex, int length) {
        int childIndex = parentIndex * 2 + 1;
        int tmp = nums[parentIndex];
        while (childIndex < length) {
            if (childIndex + 1 < length && nums[childIndex + 1] > nums[childIndex]) {
                childIndex++;
            }
            if (tmp >= nums[childIndex]) {
                break;
            }
            nums[parentIndex] = nums[childIndex];
            parentIndex = childIndex;
            childIndex = parentIndex * 2 + 1;
        }
        nums[parentIndex] = tmp;
    }

    public int[] heapSort(int[] nums) {
        creatHeap(nums);
        for (int i = nums.length - 1; i > 0; i--) {
            int tmp = nums[i];
            nums[i] = nums[0];
            nums[0] = tmp;
            siftDown(nums, 0, i);
        }
        return nums;
    }
}