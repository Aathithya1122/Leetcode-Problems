class Solution {
    public int maximumGain(String s, int x, int y) {
        List<Character> list=new ArrayList<>();
        for(char c : s.toCharArray()){
            list.add(c);
        }
        int sum=0;
        if(x>y){
            int i=0;
            while(i<list.size()){
                if(i<list.size()-1 && list.get(i)=='a' && list.get(i+1)=='b'){
                    sum+=x;
                    list.remove(i);
                    list.remove(i);
                    if(i>0){
                        i--;
                    }
                }else{
                    i++;
                }
            }
            i=0;
            while(i<list.size()){
                if(i<list.size()-1 && list.get(i)=='b' && list.get(i+1)=='a'){
                    sum+=y;
                    list.remove(i);
                    list.remove(i);
                    if(i>0){
                        i--;
                    }
                }else{
                    i++;
                }
            }
        }else{
            int i=0;
            while(i<list.size()){
                if(i<list.size()-1 && list.get(i)=='b' && list.get(i+1)=='a'){
                    sum+=y;
                    list.remove(i);
                    list.remove(i);
                    if(i>0){
                        i--;
                    }
                }else{
                    i++;
                }
            }
            i=0;
            while(i<list.size()){
                if(i<list.size()-1 &&  list.get(i)=='a' && list.get(i+1)=='b'){
                    sum+=x;
                    list.remove(i);
                    list.remove(i);
                    if(i>0){
                        i--;
                    }
                }else{
                    i++;
                }
            }
        }
        return sum;
    }
}