class Solution 
{
    public boolean containsDuplicate(int[] nums) 
    {
        HashMap <Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++)
        {
            int value=nums[i];
            if(map.containsKey(value))
            {
                return true;
            }
            else
                map.put(nums[i], value);
        }
        return false;
    }
}