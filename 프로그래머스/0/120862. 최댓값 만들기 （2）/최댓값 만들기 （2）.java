import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int max1 = numbers[numbers.length-2] * numbers[numbers.length-1];
        int max2 = numbers[0] * numbers[1];
        
        if(max1>max2){
            return max1;
        }else{
            return max2;
        }
        
        
        
    }
}