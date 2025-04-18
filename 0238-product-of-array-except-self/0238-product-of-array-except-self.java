class Solution {
    public int[] productExceptSelf(int[] nums) 
    {
        int answer[] = new int[nums.length];
        int loop1=1 , loop2=1;
        for(int i = 0; i < nums.length; i++)
        {
            answer[i] = loop1;
            loop1 = nums[i] * loop1;
        }
        for(int i = nums.length - 1; i >= 0; i--)
        {
            answer[i] = answer[i]*loop2;
            loop2 = nums[i] * loop2;
        }
        return answer;
    }
}