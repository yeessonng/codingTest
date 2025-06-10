class Solution {
    public int[] solution(int n) {
        int allCount = 0;
        int b = n;
        while(b != 1){
            if(b % 2 == 0){
                b /= 2;
                allCount++;
            }else{
                b = 3 * b + 1;
                allCount++;
            }
        }
        allCount++;
        
        int a[] = new int[allCount];
        
        int count = 0;
        a[count] = n;
        count++;
        while(n != 1){
            if(n % 2 == 0){
                n /= 2;
                a[count] = n;
                count++;
            }else{
                n = 3 * n + 1;
                a[count] = n;
                count++;
            }
        }
        return a;
    }
}