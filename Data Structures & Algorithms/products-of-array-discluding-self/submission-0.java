class Solution {
    public int[] productExceptSelf(int[] nums) {
        int count=0;
        int pro=1;
        int n=nums.length;
        for(int i:nums)
        {
            if(i==0)
            {
                count++;
            }
            else
            {
                pro*=i;
            }
        }
        int res[]=new int[n];
        if(count==0)
        {
            for(int i=0;i<n;i++)
            {
                res[i]=pro/nums[i];
            }
            return res;
        }
        else if(count==1)
        {
            for(int i=0;i<n;i++)
            {
                if(nums[i]==0)
                {
                    res[i]=pro;
                }
                else
                {
                    res[i]=0;
                }
            }
            return res;
        }
        else
        {
            for(int i=0;i<n;i++)
            {
                res[i]=0;
            }
            return res;
        }
    }
}  
