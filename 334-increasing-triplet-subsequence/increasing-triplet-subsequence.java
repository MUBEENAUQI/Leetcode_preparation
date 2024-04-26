class Solution {
    public boolean increasingTriplet(int[] nums) {
         int l = nums.length;
        if (l < 3)
            return false;

        int firstmin = Integer.MAX_VALUE;
        int secondmin = Integer.MAX_VALUE;

        for (int i = 0; i < l; i++) {
            if (nums[i] <= firstmin) {
                firstmin = nums[i];
            } else if (nums[i] <= secondmin) {
                secondmin = nums[i];
            } else {
                return true;
            }
        }

        return false;
    }
}