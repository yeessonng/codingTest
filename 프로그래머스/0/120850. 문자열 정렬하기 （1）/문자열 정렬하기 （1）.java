import java.util.Arrays;
class Solution {
    public int[] solution(String my_string) {
        //정규 표현식 사용해서 숫자 아닌 것들 문자열에서 삭제 > 숫자만 냅두고 문자열 배열로 만듬
        String[] temp = my_string.replaceAll("[^0-9]", "").split("");
        //최종 반환해 줄 숫자 배열 선언
        int answer[] = new int[temp.length];
        //문자열 > 숫자 변환해야 함(Integer.parseInt()사용 문자열 > 숫자 변환 가능)
        for(int i = 0; i < temp.length; i++){
            answer[i] = Integer.parseInt(temp[i]);
        }
        //오름차순 정렬
        Arrays.sort(answer);
        
        return answer;
        
    }
}