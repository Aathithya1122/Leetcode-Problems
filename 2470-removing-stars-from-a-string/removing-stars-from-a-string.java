class Solution {
    public String removeStars(String s) {
        List<Character> list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*'){
                list.remove(list.size()-1);
            }else{
                list.add(s.charAt(i));
            }
        }
        if(list.size()==0)
            return "";
        s="";
        for(int i=0;i<list.size();i++){
            s+=list.get(i);
        }
        return s;
    }
}