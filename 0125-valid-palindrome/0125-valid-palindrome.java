class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String s1="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                s1+=c;
            }
        }
        char[] c=s1.toCharArray();
        int i=0;
        int j=c.length-1;
        while(i<j){
            if(c[i]!=c[j])return false;
            i++;
            j--;
        }
        return true;
    }
}