class Solution {
    public int solution(int n) {
        //참조 변수, 기본형 직접 캐스팅은 불가하므로 함수 사용
        String answer = String.valueOf(n);
        int result = 0;
        for(int i = 0; i < answer.length(); i++){
            result += Integer.parseInt(String.valueOf(answer.charAt(i)));
        }
        return result;
    }
}