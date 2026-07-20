class Solution {
    public int[] twoSum(int[] a, int target) {
        int n=a.length;
        int p=0,q=n-1;
        int res[]=new int[2];
        while(p<=q)
        {
            if(a[p]+a[q]==target)
            {
                res[0]=p+1;
                res[1]=q+1;
                return res;
            }
            else if(a[p]+a[q]>target)
            {
                q--;
            }
            else
            {
                p++;
            }
        }
        return res;
    }
}
