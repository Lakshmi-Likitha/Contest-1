class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int minLength = Integer.MAX_VALUE;
        int left = 0, sum = 0;
        
        for (int right = 0; right < n; right++) {
            sum += nums[right];
            
            while (sum >= target) {
                minLength = Math.min(minLength, right - left + 1);
                sum -= nums[left++];
            }
        }
        
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
