class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> st=new Stack<String>();
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+")){
                int x=Integer.parseInt(st.pop());
                int y=Integer.parseInt(st.pop());
                int z=y+x;
                st.push(String.valueOf(z));
            }else if(tokens[i].equals("-")){
                int x=Integer.parseInt(st.pop());
                int y=Integer.parseInt(st.pop());
                int z=y-x;
                st.push(String.valueOf(z));
            }else if(tokens[i].equals("*")){
                int x=Integer.parseInt(st.pop());
                int y=Integer.parseInt(st.pop());
                int z=y*x;
                st.push(String.valueOf(z));
            }else if(tokens[i].equals("/")){
                int x=Integer.parseInt(st.pop());
                int y=Integer.parseInt(st.pop());
                int z=y/x;
                st.push(String.valueOf(z));
            }else{
                st.push(tokens[i]);
            }
        }
        return Integer.parseInt(st.pop());
    }
}