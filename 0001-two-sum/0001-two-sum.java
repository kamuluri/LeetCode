class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int a=nums[i];
            int b=target-a;

            if(m.containsKey(b)){
               return new int[]{i,m.get(b)};
            }
            m.put(a,i);
        }
       return new int[]{};
    }
}