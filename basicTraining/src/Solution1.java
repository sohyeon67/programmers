public class Solution1 {
    public String solution(String my_string, int n) {
        String answer = "";
        int index = my_string.length() - n;
        answer = my_string.substring(index);
        return answer;
    }
}
