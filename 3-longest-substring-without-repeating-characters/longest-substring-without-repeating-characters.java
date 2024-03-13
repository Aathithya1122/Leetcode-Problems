class Solution {
    public int lengthOfLongestSubstring(String s) {
        int j=0,max=0,i=0;
        Set<Character> set=new HashSet<>();
        while(i<s.length()){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
                max=Math.max(max,set.size());
                i++;
            }else{
                set.remove(s.charAt(j++));
            }
        }
        return max;
    }
}