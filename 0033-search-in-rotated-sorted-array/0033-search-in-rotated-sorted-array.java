class Solution 
{
    public int search(int[] nums, int target) 
    {
        int low = 0;
        int high = nums.length-1;
        int result = -1;
        while(low <= high)
        {
            int middle = low + (high - low)/2;
            if(nums[middle] == target) 
            {   result = middle; return result; }
            else if(nums[low] == target) 
            {   result = low; return result; }
            else if(nums[high] == target) 
            {   result = high; return result; }
            

            if(nums[low] <= nums[middle])
            {
                if(target <= nums[low] || target > nums[middle])
                {
                    low = middle + 1;
                }
                else
                    high = middle - 1;
            }
            else
            {
                if(target > nums[high] || target < nums[middle])
                {
                    high = middle - 1;
                }
                else
                    low = middle + 1;
            }
        } 
    return result;
    }
}