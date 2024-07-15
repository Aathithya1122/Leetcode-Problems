class Solution {
    public String reverseParentheses(String s) {
        char c[]=s.toCharArray();
        int i=0,n=c.length;
        while(i<n){
            if(c[i]==')'){
                int j=i-1;
                while(j>=0){
                    if(c[j]=='('){
                        break;
                    }
                    j--;
                }
                int start=j,end=i;
                c[start++]=' ';
                c[end--]=' ';
                while(start<end){
                    char t=c[start];
                    c[start]=c[end];
                    c[end]=t;
                    start++;
                    end--;
                }
            }
            i++;
        }
        String str="";
        i=0;
        while(i<n){
            if(c[i]!=' '){
                str+=c[i];
            }
            i++;
        }
        return str;
    }
}