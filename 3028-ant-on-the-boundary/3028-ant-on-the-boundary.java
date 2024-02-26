class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int c=0,val=0;
        for(int i=0;i<nums.length;i++){
            val+=nums[i];
            if(val==0){
                c++;
            }
        }
        return c;
    }
}