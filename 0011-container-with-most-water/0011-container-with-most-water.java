class Solution 
{
    public int maxArea(int[] height) 
    {
        int max = 0;
        int left = 0; 
        int right = height.length-1;
        int width= right - left;
        
        while(left < right)
        {   
            if(height[left] < height[right])
            {
                max = Math.max( max, height[left] * width);
                left++;
            }
            else if(height[left] > height[right])
            {
                max = Math.max( max, height[right] * width);
                right--; 
            }
            else
            {
                max = Math.max( max, height[left] * width);
                left++;
            }
            width--;
        }
        return max;
    }
}