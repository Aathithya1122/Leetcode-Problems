class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int exchangeCount=numBottles;
        while(numBottles>=numExchange){
            numBottles-=numExchange;
            exchangeCount++;
            numBottles++;
        }
        return exchangeCount;
    }
}