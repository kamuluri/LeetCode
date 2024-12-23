class Solution {
    public int lengthOfLastWord(String s) {
        String s2=s.trim();
        char[] c=s2.toCharArray();
        int i=c.length-1;
        int count=0;
        while(i>=0&&c[i]!=' ')
        {
            i--;
        }
       while(i<c.length-1)
       {
           i++;
           count++;
       }
    return count;
    }
}