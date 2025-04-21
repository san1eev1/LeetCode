class Solution 
{
    public int maxArea(int[] height) 
    {
        int max = 0;
        int l = 0; 
        int r = height.length-1;
        int width= r - l;
        
        while(l < r)
        {   
            if(height[l] < height[r])
            {
                max = Math.max( max, height[l] * width);
                l++;
            }
            else
            {
                max = Math.max( max, height[r] * width);
                r--; 
            }
            width--;
        }
        return max;
    }
}