import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        HashMap <Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++)
        {
            int value = target - nums[i];
            if(map.containsKey(value))
            {   
                return new int[]{i, map.get(value)};
            }
            else 
                map.put(nums[i],i);
        }
        return null;

    }
}