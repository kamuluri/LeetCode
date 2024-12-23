class Solution {
    public boolean isAnagram(String s, String t) {
        while(s.length()==t.length())
        {
            char a=s.charAt(0);
            s=s.replace(a+"","");
            t=t.replace(a+"","");
            if(s.length()==0 && t.length()==0){
                return true ;
            }
           
        }
        return false;
    }
}