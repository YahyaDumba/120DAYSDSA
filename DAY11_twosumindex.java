class Solution {
    public int[] twoSum(int[] nums, int target) {
        int complement;
        //traverse to every element in the loop
        for(int i=0;i<nums.length;i++)
        {
            complement = target-nums[i];
            //check second number
            for(int j=0;j<nums.length;j++)
            {
                if(i==j) continue;
                if(nums[j]==complement)
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{0,0};
    }
}