class Solution {
    public int solution(int[] numbers) {
        int max1 = 0;
        int max2 = 0;
        for(int values : numbers){
            if(values > max1){
                max2 = max1;
                max1 = values;
            }else if(values > max2){
                max2 = values;
            }
        }
        return max1 * max2;
    }
}