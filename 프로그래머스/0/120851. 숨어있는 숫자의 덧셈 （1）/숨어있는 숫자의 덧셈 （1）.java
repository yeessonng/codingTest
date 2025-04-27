class Solution {
    public int solution(String my_string) {
        //숫자가 아닌 것들을 공백으로
        String[] temp = my_string.replaceAll("[^0-9]", "").split("");
        int answer = 0;
        for(int i = 0; i < temp.length; i ++){
            answer += Integer.parseInt(temp[i]);
        }
        return answer;
    }
}