class Solution {
    public int longestConsecutive(int[] nums) {
        int longestLen = 0;
        Map<Integer,Boolean> m=new HashMap();
        for(int num:nums){
            m.put(num,Boolean.FALSE);
        }
        for(int num: nums){
            int currentLength=1;

            // checking forward direction
            int nextnum=num+1;
            while(m.containsKey(nextnum) && m.get(nextnum)==false){
                currentLength++;
                m.put(nextnum,Boolean.TRUE);
                nextnum++;
            }
            // checking backward direction
            int prevnum=num-1;
            while(m.containsKey(prevnum) && !m.get(prevnum)){
                currentLength++;
                m.put(prevnum,true);
                prevnum--;
            }
            longestLen=Math.max(longestLen,currentLength);
        }
        return longestLen;
    }
}