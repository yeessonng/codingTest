class Solution {
    public int solution(int hp) {
        int count = 0;
        count = hp / 5;
        if(hp % 5 != 0){
            count += (hp % 5) / 3;
            if((hp % 5) % 3 != 0){
                count += (hp % 5) % 3;
            }
        }
        return count;
    }
}