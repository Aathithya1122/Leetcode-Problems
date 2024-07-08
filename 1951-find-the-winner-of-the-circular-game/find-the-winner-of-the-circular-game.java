class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> list=new ArrayList<>();
        int i=1;
        int count=0;
        while(i<=n){
            list.add(i);
            i++;
        }
        i=0;
        while(list.size()>1){
            count++;
            if(count==k){
                count=0;
                list.remove(i);
            }else{
                i++;
            }
            if(i==list.size()){
                i=0;
            }
        }
        return list.get(0);
    }
}