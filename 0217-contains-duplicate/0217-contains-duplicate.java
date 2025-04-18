class Solution 
{
    public boolean containsDuplicate(int[] nums) 
    {
        Set <Integer> map = new HashSet<>();
        for(int i=0; i<nums.length; i++)
        {
            int value=nums[i];
            if(map.contains(value))
                return true;
            else
                map.add(nums[i]);
        }
        return false;
    }
}