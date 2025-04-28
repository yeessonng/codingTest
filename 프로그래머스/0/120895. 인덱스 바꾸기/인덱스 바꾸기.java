class Solution {
    public String solution(String my_string, int num1, int num2) {
        StringBuilder sb = new StringBuilder(my_string);
        String s1 = my_string.substring(num1, num1+1);
        String s2 = my_string.substring(num2, num2+1);
        
        sb.replace(num1, num1+1, s2);
        sb.replace(num2, num2+1, s1);
        
        return sb.toString();
    }
}