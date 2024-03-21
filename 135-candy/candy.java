class Solution {
    public int candy(int[] ratings) {
        int n=ratings.length;
        int leftArray[]=new int[n];
        int rightArray[]=new int[n];
        Arrays.fill(leftArray,1);
        Arrays.fill(rightArray,1);
        for(int i=1;i<n;i++){
            if(ratings[i]>ratings[i-1]){
                leftArray[i]=leftArray[i-1]+1;
            }
        }
        for(int i=n-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]){
                rightArray[i]=1+rightArray[i+1];
            }
        }
        int val=0;
        for(int i=0;i<n;i++){
            val+=Math.max(leftArray[i],rightArray[i]);
        }
        return val;
    }
}