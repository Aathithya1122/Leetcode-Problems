class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> min=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            int minVal=Integer.MAX_VALUE;
            for(int j=0;j<matrix[0].length;j++){
                minVal=Math.min(minVal,matrix[i][j]);
            }
            min.add(minVal);
        }
        for(int j=0;j<matrix[0].length;j++){
            int maxVal=Integer.MIN_VALUE;
            for(int i=0;i<matrix.length;i++){
                maxVal=Math.max(maxVal,matrix[i][j]);
            }
            if(min.contains(maxVal)){
                list.add(maxVal);
            }
        }
        return list;
    }
}