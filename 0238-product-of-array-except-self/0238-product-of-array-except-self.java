class Solution {
    public int[] productExceptSelf(int[] nums) 
    {
        int answer[] = new int[nums.length];
        int larray=1 , rarray=1;
        for(int i = 0; i < nums.length; i++)
        {
            answer[i] = larray;
            larray = nums[i] * larray;
        }
        for(int i = nums.length - 1; i >= 0; i--)
        {
            answer[i] = answer[i]*rarray;
            rarray = nums[i] * rarray;
        }
        return answer;
    }
}