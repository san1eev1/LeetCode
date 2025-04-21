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
            int min = Math.min( height[left], height[right]);
            max = Math.max( max, min * width);
            
            if(height[left] < height[right])
            {
                left++;
            }
            else if(height[left] > height[right])
            {
                right--; 
            }
            else
            {
                left++;
            }
            width--;
        }
        return max;
    }
}