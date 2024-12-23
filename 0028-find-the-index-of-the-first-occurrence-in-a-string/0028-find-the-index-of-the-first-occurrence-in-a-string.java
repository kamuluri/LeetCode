class Solution
 {
    public int strStr(String haystack, String needle)
     {
        for(int i=0;i<=haystack.length()-needle.length();i++)
        {
                String s1=haystack.substring(i,i+needle.length());
                if(s1.equals(needle))
                {
                        return i;
                }
        }
        return -1;
    }
}