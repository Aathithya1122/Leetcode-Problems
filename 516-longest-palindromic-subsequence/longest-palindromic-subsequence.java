class Solution {
    public int longestPalindromeSubseq(String s) {
        String rev=new StringBuilder(s).reverse().toString();
        int m=s.length();
        int arr[][]=new int[m+1][m+1];
        int i,j;
        for(i=1;i<=m;i++){
            for(j=1;j<=m;j++){
                if(s.charAt(i-1)==rev.charAt(j-1)){
                    arr[i][j]=1+arr[i-1][j-1];
                }else{
                    arr[i][j]=Math.max(arr[i][j-1],arr[i-1][j]);
                }
            }
        }
        return arr[m][m];
    }
}