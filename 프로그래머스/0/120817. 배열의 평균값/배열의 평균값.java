class Solution {
    public double solution(int[] numbers) {
        int answer = 0;
        for(int values: numbers){
            answer += values;
        }
        return (double)answer / numbers.length;
    }
}