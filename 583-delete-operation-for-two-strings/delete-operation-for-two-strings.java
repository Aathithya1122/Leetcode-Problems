class Solution {
    public int minDistance(String word1, String word2) {
        int m=word1.length(),n=word2.length();
        int arr[][]=new int[m+1][n+1];
        int i,j;
        for(i=1;i<=m;i++){
            for(j=1;j<=n;j++){
                if(word1.charAt(i-1)==word2.charAt(j-1)){
                    arr[i][j]=1+arr[i-1][j-1];
                }else{
                    arr[i][j]=Math.max(arr[i-1][j],arr[i][j-1]);
                }
            }
        }
        return m-arr[m][n]+n-arr[m][n];
    }
}