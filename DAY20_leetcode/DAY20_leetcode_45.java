class Solution {
    public int jump(int[] nums) {
        int totaljumps=0;
        int destination=nums.length-1;
        int covg=0,lastjumpidx=0;
        if(nums.length==1)
        return 0;
        for(int i=0;i<nums.length;i++)
        {
            covg=Math.max(covg,i+nums[i]);
            if(i==lastjumpidx)
            {
            lastjumpidx=covg;
            totaljumps++;
            
        
        if(covg>=destination)
        {
            return totaljumps;
        }
        }
        }
        return totaljumps;
    }
}