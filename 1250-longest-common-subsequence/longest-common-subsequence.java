class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int i=0,j=0;
        int m=text1.length(),n=text2.length();
        int arr[][]=new int[m+1][n+1];
        for(i=1;i<=m;i++){
            for(j=1;j<=n;j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    arr[i][j]=1+arr[i-1][j-1];
                }else{
                    arr[i][j]=Math.max(arr[i][j-1],arr[i-1][j]);
                }
            }
        }
        return arr[m][n];
    }
}