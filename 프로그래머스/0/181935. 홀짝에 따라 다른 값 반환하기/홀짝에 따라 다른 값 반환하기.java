class Solution {
    public int solution(int n) {
        int answer1 = 0;
        int answer2 = 0;
        for(int i = 1; i <= n; i++){
            if(i % 2 == 0){
                answer1 += (i * i);
            }else{
                answer2 += i;
            }
        }
        if(n % 2 == 0){
            return answer1;
        }else{
            return answer2;
        }
    }
}