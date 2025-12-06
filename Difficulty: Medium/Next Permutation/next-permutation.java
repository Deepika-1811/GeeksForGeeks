class Solution {

    void nextPermutation(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return;
        }

        int n = nums.length;
        int index1 = -1;

        // Step 1: Find first decreasing element from the right
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index1 = i;
                break;
            }
        }

        // If no such element found, array is in descending order → reverse it
        if (index1 == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        // Step 2: Find element just larger than nums[index1]
        for (int j = n - 1; j > index1; j--) {   // FIX: j > index1, not >=
            if (nums[j] > nums[index1]) {
                swap(nums, index1, j);
                break;
            }
        }

        // Step 3: Reverse right part
        reverse(nums, index1 + 1, n - 1);
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}