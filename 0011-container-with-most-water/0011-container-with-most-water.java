class Solution 
{
    public int maxArea(int[] height) 
    {
        int max = 0, max1=0;
        int left = 0; 
        int right = height.length-1;
        int width= right - left;
        
        while(left < right)
        {   
            if(height[left] < height[right])
            {
                max1 = height[left] * width;
                max = Math.max( max, max1);
                left++;
            }
            else if(height[left] > height[right])
            {
                max1 = height[right] * width;
                max = Math.max( max, max1);
                right--; 
            }
            else
            {
                max1 = height[left] * width;
                max = Math.max( max, max1);
                left++; 
            }
            width--;
        }
        return max;
    }
}