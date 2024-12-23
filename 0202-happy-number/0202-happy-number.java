class Solution {
    public boolean isHappy(int n) {
        int temp=n;
       Set<Integer> s=new HashSet<>();
        while(true){
            int sum=0;
            while(n>0){
                int rem=n%10;
                int sq=rem*rem;
                sum=sum+sq;
                n/=10;
            }
            n=temp;
            if(sum==1) return true;

            n=sum;
            if(s.contains(n))
                return false;
            s.add(n);
        }
    }
}