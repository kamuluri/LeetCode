class Solution {
    public int majorityElement(int[] nums) {
        int maxlength=0;
        int a=0;
        for(int i=0;i<nums.length;i++)
        {
            
            int count=1;
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                   
                    count++;
                }
            }
            if(maxlength<count)
            {
                a=nums[i];
                maxlength=count;
            }
        }
        return a;
       
        
    }
}