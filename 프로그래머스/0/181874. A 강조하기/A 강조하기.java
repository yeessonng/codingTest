class Solution {
    public String solution(String myString) {
        myString = myString.replace("a", "A");
        StringBuilder sb = new StringBuilder(myString);
        for(int i = 0; i < myString.length(); i++){
            if(myString.charAt(i) != 'A' && Character.isUpperCase(myString.charAt(i))){
                sb.replace(i, i+1, Character.toString(Character.toLowerCase(myString.charAt(i))));
            }
        }
        return sb.toString();
    }
}