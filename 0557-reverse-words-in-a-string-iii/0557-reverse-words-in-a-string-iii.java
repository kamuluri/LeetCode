class Solution {
    public String reverseWords(String s) {
        String[] s1=s.split(" ");
        String reversed="";

        for(int i=0;i<s1.length;i++){
            StringBuilder sb=new StringBuilder(s1[i]);
            reversed=reversed+" "+sb.reverse().toString();
            
        }
        return reversed.trim();
    }
}