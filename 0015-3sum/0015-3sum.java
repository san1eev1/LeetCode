class Solution 
{
    public List<List<Integer>> threeSum(int[] nums) 
    {
        List<List<Integer>> solution= new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0; i<nums.length-2; i++)
        {
            if (i > 0 && nums[i] == nums[i - 1]) continue; 
            Set<Integer> temp = new HashSet<>();

            for (int j = i + 1; j < nums.length; j++) 
            {
                
                int target = -nums[i] - nums[j]; 
                if (temp.contains(target)) 
                {
                    solution.add(Arrays.asList(nums[i], nums[j], target));
                    while (j + 1 < nums.length && nums[j] == nums[j + 1]) 
                        j++;
                }
                temp.add(nums[j]);
            }
        }
        return solution;
    }
}