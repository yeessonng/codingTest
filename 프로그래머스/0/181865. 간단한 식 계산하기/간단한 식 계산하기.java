class Solution {
    public int solution(String binomial) {
        String[] answer = binomial.split(" ");
        int total = 0;
        if(answer[1].equals("+")){
            total = Integer.parseInt(answer[0]) + Integer.parseInt(answer[2]);
        }else if(answer[1].equals("-")){
            total = Integer.parseInt(answer[0]) - Integer.parseInt(answer[2]);
        }else if(answer[1].equals("*")){
            total = Integer.parseInt(answer[0]) * Integer.parseInt(answer[2]);
        }
        return total;
    }
}