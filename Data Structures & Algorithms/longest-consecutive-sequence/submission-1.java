class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        if(n==0) 
        {
            return 0;
        }
        int c=1,m=1;
        for(int i=1;i<n;i++)
        {
            if(nums[i-1]+1==nums[i])
            {
                c++;
                m=Math.max(m,c);
            }
            else if(nums[i-1]==nums[i])
            {
                continue;
            }
            else
            {
                c=1;
            }
        }
        return m;
    }
}
