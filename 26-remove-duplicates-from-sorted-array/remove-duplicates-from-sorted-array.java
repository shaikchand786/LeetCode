class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int k = 1; // first element is always unique

        // Start from second element
        for (int i = 1; i < nums.length; i++) {
            // If current element is not equal to previous unique element
            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i]; // place unique element
                k++; // increase count
            }
        }
        return k;
    }
}