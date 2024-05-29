class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1) return  intervals;
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int []> ans=new ArrayList<>();
        int[] current=intervals[0];
        for(int[] inter : intervals){
            if(inter[0]<=current[1]){
                current[1]=Math.max(inter[1],current[1]);
            }else{
                ans.add(current);
                current=inter;
            }
        }
        ans.add(current);
        return ans.toArray(new int[ans.size()][]);
    }
}