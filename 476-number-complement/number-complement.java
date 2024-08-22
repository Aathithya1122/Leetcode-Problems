class Solution {
    public int findComplement(int num) {
        String s="";
        while(num>0){
            if(num%2==0){
                s+='0';
            }else{
                s+='1';
            }
            num/=2;
        }
        String str="";
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)=='0'){
                str+='1';
            }else{
                str+='0';
            }
            i++;
        }
        int val=0,n=1;
        i=0;
        while(i<str.length()){
            if(str.charAt(i)=='1'){
                val+=n;
            }
            n+=n;
            i++;
        }
        return val;
    }
}