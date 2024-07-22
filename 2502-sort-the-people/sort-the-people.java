class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int []arr=new int[heights.length];
        String []str=new String[names.length];
        for(int x=0;x<heights.length;x++){
            arr[x]=heights[x];
        }
        Arrays.sort(arr);
        int index=0,n=0;
        for(int i=arr.length-1;i>=0;i--){
            index=0;
            for(int j=0;j<heights.length;j++){
                if(arr[i]==heights[j]){
                    index=j;
                    break;
                }
            }
            str[n]=names[index];
            n++;
        }
        return str;
    }
}