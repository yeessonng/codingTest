import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int k) {
        if(k % 2 == 0){//짝수
            arr = Arrays.stream(arr)
                .map(i -> i + k)
                .toArray();
        }else{//홀수
            arr = Arrays.stream(arr)
                .map(i -> i * k)
                .toArray();
        }
        return arr;
    }
}