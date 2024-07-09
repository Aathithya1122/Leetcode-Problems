class Solution {
    public void rotate(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int arr[][]=new int[n][m];
        int a=0,b=0;
        for(int i=0;i<n;i++){
            b=0;
            for(int j=m-1;j>=0;j--){
                arr[a][b++]=mat[j][i];
            }
            a++;
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=arr[i][j];
            }
        }
    }
    public boolean checkRotation(int[][] mat, int[][] target){
        int i,j,n=mat.length,m=mat[0].length;
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                if(mat[i][j]!=target[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean findRotation(int[][] mat, int[][] target) {
            int i,j;
            int n=mat.length;
            int m=mat[0].length;
            if(checkRotation(mat,target)){
                return true;
            }
            rotate(mat);
            if(checkRotation(mat,target)){
                return true;
            }
            rotate(mat);
            if(checkRotation(mat,target)){
                return true;
            }
            rotate(mat);
            if(checkRotation(mat,target)){
                return true;
            }
            return false;
    }
}