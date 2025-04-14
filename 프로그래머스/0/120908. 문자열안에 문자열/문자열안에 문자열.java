class Solution {
    public int solution(String str1, String str2) {
        int index = str1.indexOf(str2);
        if(index == -1){
            return 2;
        }else{
            return 1;
        }
        
    }
}