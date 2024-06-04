class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> set=new HashSet<>();
        int sum=0;
        for(char c : s.toCharArray()){
            if(set.contains(c)){
                set.remove(c);
                sum+=2;
            }else{
                set.add(c);
            }
        }
        if(!set.isEmpty()){
            sum+=1;
        }
        return sum;
    }
}