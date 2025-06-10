import java.util.ArrayList;
class Solution {
    public int[] solution(int[] num_list) {
        ArrayList<Integer> list = new ArrayList();
        for(int n : num_list){
            list.add(n);
        }
        int length = num_list.length;
        if(num_list[length-1] > num_list[length-2]){
            list.add(num_list[length-1] - num_list[length-2]);
        }else{
            list.add(num_list[length-1] * 2);
        }
        
        return list.stream().mapToInt(i->i).toArray();
    }
}