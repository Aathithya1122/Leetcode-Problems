class Solution {
    public long countSubarrays(int[] nums, int k) {
        int i,max=0,j;
        for(i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        long count=0;
        i=0;
        j=0;
        int frq[]=new int[max+1];
        while(i<nums.length){
            frq[nums[i]]++;
            while(frq[max]>=k){
                count+=(nums.length-i);
                frq[nums[j]]--;
                j++;
            }
            i++;
        }
        return count;
    }
}