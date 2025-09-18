class Solution {
    public int solution(int a, int b, int c) {
        // 세 숫자가 모두 같은 경우
        if(a == b && b == c) {
            return (a + b + c) 
                   * ((int)Math.pow(a,2) + (int)Math.pow(b,2) + (int)Math.pow(c,2)) 
                   * ((int)Math.pow(a,3) + (int)Math.pow(b,3) + (int)Math.pow(c,3));
        }
        // 세 숫자가 모두 다른 경우
        else if(a != b && b != c && a != c) {
            return a + b + c;
        }
        // 두 개만 같은 경우
        else {
            return (a + b + c) 
                   * ((int)Math.pow(a,2) + (int)Math.pow(b,2) + (int)Math.pow(c,2));
        }
    }
}
