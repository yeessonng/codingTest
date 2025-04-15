class Solution {
    public int[] solution(int money) {
        int jan = money / 5500;
        int change = money % 5500;
        int answer[] = {jan, change};
        return answer;
    }
}