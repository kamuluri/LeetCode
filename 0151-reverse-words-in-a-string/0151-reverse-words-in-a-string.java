class Solution {
    public String reverseWords(String s)
     {
        String s2="";
		char[] c=s.toCharArray();
		int i=c.length-1;
		int j=c.length-1;
		while(i>=0)
		{
			while(j>=0&&c[j]!=' ')
			{
				j--;
			}
			int k=j+1;
			while(k<=i)
			{
				s2=s2+c[k];
				k++;
			}
			if(i>=0)
			{
				s2=s2+" ";
			}
			j--;
			i=j;
		}
        String output = s2.replaceAll("\\s+", " ").trim();
		return output;
    }
    
}