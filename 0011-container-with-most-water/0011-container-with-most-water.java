class Solution 
{
    public int maxArea(int[] height) 
    {
        int max = 0;
        int l = 0; 
        int r = height.length-1;
        while(l < r)
        {   
            int w = r - l;
            if(height[l] < height[r])
            {
                max = Math.max( max, height[l] * w);
                l++;
            }
            else
            {
                max = Math.max( max, height[r] * w);
                r--; 
            }
        }
        //System.gc();
        return max;
    }
}