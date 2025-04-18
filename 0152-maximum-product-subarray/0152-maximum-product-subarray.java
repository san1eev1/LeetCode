class Solution 
{
    public int maxProduct(int[] nums) 
    {
        int max = nums[0];
        int min = nums[0];
        int maxproduct = nums[0];

        for(int i=1; i<nums.length; i++)
        {
            int current = nums[i];
            int temp = max;
            max = Math.max(current, Math.max(max * current, min * current));
            min = Math.min(current, Math.min(temp * current, min * current));
            maxproduct = Math.max(maxproduct, max);
        }   
        return maxproduct;
    }
}