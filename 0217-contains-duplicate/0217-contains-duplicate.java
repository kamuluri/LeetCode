class Solution {
    public boolean containsDuplicate(int[] nums) {
       Set<Integer> s=new HashSet();
       for(int i=0;i<nums.length;i++){
            if(!(s.contains(nums[i]))){
                s.add(nums[i]);
            }
       }
       return s.size()!=nums.length;
    }
}