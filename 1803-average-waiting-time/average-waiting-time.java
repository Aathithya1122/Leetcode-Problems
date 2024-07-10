class Solution {
    public double averageWaitingTime(int[][] customers) {
        int valCount=0;
        long valSum=0;
        int i,m=customers.length;
        int val=0;
        for(i=0;i<m;i++){
            val=Math.max(val,customers[i][0]);
            val+=customers[i][1];
            valSum+=(val-customers[i][0]);
            valCount++;
        }
        return (double)valSum/valCount;
    }
}