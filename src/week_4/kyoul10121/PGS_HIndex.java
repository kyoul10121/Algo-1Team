package week_4.kyoul10121;

import java.util.*;

public class PGS_HIndex {
    public int solution(int[] citations) {
        int answer = 0;

        Arrays.sort(citations);

        for(int i = 0; i < citations.length; i++) {
            int h = citations.length - i; // 인용된 논문의 수

            if(citations[i] >= h) {
                answer = h;
                break;
            }
        }
        return answer;
    }
}