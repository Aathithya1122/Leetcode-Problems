class Solution {
    public boolean isSubstringPresent(String s) {
        List<String> l1=new ArrayList<>();
        List<String> l2=new ArrayList<>();
        String str=new StringBuilder(s).reverse().toString();
        for(int i=0;i<s.length()-1;i++){
            String v=s.substring(i,i+2);
            l1.add(v);
            v=str.substring(i,i+2);
            l2.add(v);
        }
        for(int i=0;i<l1.size();i++){
            if(l2.contains(l1.get(i))){
                return true;
            }
        }
        return false;
    }
}