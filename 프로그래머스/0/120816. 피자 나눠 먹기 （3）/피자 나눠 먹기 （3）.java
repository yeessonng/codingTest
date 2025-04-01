class Solution {
    public int solution(int slice, int n) {
        int answer = n % slice;
        if(answer == 0){
            return n / slice;
        }else{
            return n / slice + 1;
        }
    }
}