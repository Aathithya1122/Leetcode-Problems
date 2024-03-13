class Solution {
    public int pivotInteger(int n) {
        if(n==1)    return 1;
        if(n==3 || n==4 || n==5 || n==6 || n==7)    return -1;
        int x=0;
        for(int i=1;i<=n/2;i++){
            x+=i;
        }
        int y=0;
        for(int i=n/2;i<=n;i++){
            y+=i;
        }
        if(x==y)    return n/2;
        int z=n/2;
        while(x<y){
            y-=z;
            z++;
            x+=z;
            if(x==y)    return z;
        }
        return -1;
    }
}