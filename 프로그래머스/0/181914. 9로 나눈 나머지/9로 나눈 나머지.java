class Solution {
    public int solution(String number) {
        int count = 0;
        for(int i = 0; i < number.length(); i++){
            count += number.charAt(i) - '0';
        }
        return count % 9;
    }
}