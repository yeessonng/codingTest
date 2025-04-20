class Solution {
    public int[] solution(int n) {
        int size = (n + 1) / 2;
        int answer[] = new int[size];
        for(int i = 1, j = 0; i <= n; i++)
            if(i%2!=0){
                answer[j] = i;
                j++;
            }
        return answer;
    }
}