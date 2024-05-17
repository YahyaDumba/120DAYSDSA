class Solution {
    public boolean canJump(int[] nums) {
        int finalpos=nums.length-1;
        for(int index=nums.length-2;index>=0;index--)
        {
            if(index+nums[index]>=finalpos)
            {
                finalpos=index;
            }
        }
        return finalpos==0;
    }
}