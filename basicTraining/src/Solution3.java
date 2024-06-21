import java.util.Arrays;

public class Solution3 {
    public int[] solution(int start_num, int end_num) {
        int size = end_num - start_num + 1;
        int[] answer = new int[size];

        int i=0;
        for(int n=start_num; n<=end_num; n++) {
            answer[i++] = n;
        }
//        for(int j = 0; j <=end_num-start_num; j++) {
//            answer[j] = start_num + j;
//        }
        return answer;
    }

    public static void main(String[] args) {
        Solution3 s3 = new Solution3();
        System.out.println(Arrays.toString(s3.solution(3, 8)));
    }
}
