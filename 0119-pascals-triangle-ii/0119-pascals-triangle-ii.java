class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> l=new ArrayList<>();
        int[][] arr=new int[rowIndex+1][];
        for(int i=0;i<arr.length;i++){
            arr[i]=new int[i+1];
            for(int j=0;j<arr[i].length;j++){
                if(j==0||j==i){
                    arr[i][j]=1;
                }
                else{
                    arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
                }
            }

        }
         for (int val : arr[rowIndex]) {
            l.add(val);
        }
        return l;

    }
}