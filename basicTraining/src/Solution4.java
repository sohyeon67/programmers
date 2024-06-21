public class Solution4 {
    public int solution(int n, String control) {
        int answer = n;
        char c = '\u0000';
        for(int i=0; i<control.length(); i++) {
            c = control.charAt(i);
            if (c == 'w') answer += 1;
            if (c == 's') answer -= 1;
            if (c == 'd') answer += 10;
            if (c == 'a') answer -= 10;
        }
        return answer;
    }
}
