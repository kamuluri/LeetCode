class Solution {
    public String reverseWords(String s) {
        String[] s1=s.split(" ");
        StringBuilder reversed=new StringBuilder();

        for(int i=0;i<s1.length;i++){
            StringBuilder sb=new StringBuilder(s1[i]);
            reversed.append(sb.reverse());
            if(i<s1.length-1)
             reversed.append(" ");
            
        }
        return reversed.toString();
    }
}