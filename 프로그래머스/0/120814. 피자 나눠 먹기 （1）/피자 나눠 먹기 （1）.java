class Solution {
    public int solution(int n) {
        int answer = n % 7;
        if(answer == 0){
            return n / 7;
        }else{
            return (n/7)+1;
        }
    }
}