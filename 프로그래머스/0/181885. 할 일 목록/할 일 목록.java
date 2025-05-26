class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int b = 0;
        for(boolean a : finished){
            if(!a){
                b++;
            }
        }
        
        String[] answer = new String[b];
        int j = 0;
        for(int i = 0; i < todo_list.length; i++){
            if(!finished[i]){
                answer[j] = todo_list[i];
                j++;
            }
        }
        return answer;
    }
}