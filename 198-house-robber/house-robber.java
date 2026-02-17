class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int prev2 = 0;
        int prev = nums[0];
        int curr = -1;
        for(int i=1;i<n;i++)
        {
            int take = nums[i];
            if(i>1)
                take = take + prev2;
            int not_take = 0 + prev;
            curr = Math.max(take, not_take);
            prev2 = prev;
            prev = curr;
        }
        return prev;
    }
}