class Solution {
    public int maxArea(int[] heights) {
        int max=0;
        int n=heights.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int res=(j-i)*Math.min(heights[i],heights[j]);
                max=Math.max(max,res);
            }
        }
        return max;
    }
}
