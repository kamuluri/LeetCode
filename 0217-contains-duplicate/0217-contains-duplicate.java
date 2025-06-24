class Solution {
    public boolean containsDuplicate(int[] nums) {
       Set s=new HashSet();
       for(int i=0;i<nums.length;i++){
            if(!(s.contains(nums[i]))){
                s.add(nums[i]);
            }
       }
       if(s.size()==nums.length)return false;
       else return true;
    }
}