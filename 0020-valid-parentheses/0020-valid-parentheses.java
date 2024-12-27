class Solution {
    public boolean isValid(String s) {
        Stack<Character> s1=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='[' || c=='{' || c=='(' ){
                s1.push(c);
            }
            else if(c==']' || c=='}' || c==')'){
                if(s1.isEmpty() || !pair(s1.pop(),c)){
                    return false;
                }
            }
        }
        return s1.isEmpty();
    }
    public static boolean pair(char c1,char c2)
    {
        if(c1=='[' && c2==']')return true;
        if(c1=='{' && c2=='}')return true;
        if(c1=='(' && c2==')')return true;
        return false;
    }
}