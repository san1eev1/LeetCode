class Solution 
{
    public int findMin(int[] nums) 
    {
        int low = 0;
        int high = nums.length - 1;
        int min = nums[0];
        while(low < high)
        {
            if(nums[low] < nums[high])
            {
                min = Math.min(min, nums[low]);
            }
            else min = Math.min(min, nums[high]);
            int middle = low + (high-low) /2;
            

            
            if( nums[low] < nums[middle] )
            {
                min = Math.min(min, nums[low]);
                low = middle + 1;  
            }
            else  
            {
                min = Math.min(min, nums[middle]);
                high = middle ;
            }
            
        }
        return Math.min(min, nums[low]);
    }
}