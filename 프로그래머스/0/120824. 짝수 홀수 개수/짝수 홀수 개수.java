class Solution {
    public int[] solution(int[] num_list) {
        int answer[] = new int[2];
        int n1 = 0;
        int n2 = 0;
        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] % 2 == 0){
                n1++;
            }else{
                n2++;
            }
        }
        answer[0] = n1;
        answer[1] = n2;
        return answer;
    }
}