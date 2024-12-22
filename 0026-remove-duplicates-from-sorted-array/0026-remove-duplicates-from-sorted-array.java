class Solution {
    public int removeDuplicates(int[] a) {
        int count=0;
        int rd=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[rd]!=a[i])
			{
				rd++;
				a[rd]=a[i];
			}
		}
		for(int i=0;i<=rd;i++)
		{
			count++;
		}
       return count;
       
    }
}