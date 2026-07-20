class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i : nums)
        {
            if(hm.containsKey(i))
            {
                hm.put(i,hm.get(i)+1);
            }
            else
            {
                hm.put(i,1);
            }
        }
        int n=hm.size();
        int a[]=new int[n];
        int b[]=new int[n];
        int p1=0,p2=0;
        for(int i: hm.keySet())
        {
            a[p1++]=i;
            b[p2++]=hm.get(i);
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(b[j]<b[j+1])
                {
                    int temp=b[j];
                    b[j]=b[j+1];
                    b[j+1]=temp;
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        int res[]=new int[k];
        int p3=0;
        for(int i=0;i<k;i++)
        {
            res[p3++]=a[i];
        }
        return res;
    }
}
