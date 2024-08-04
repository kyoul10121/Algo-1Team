package week_3.kyoul10121;

import java.util.*;

class PGS_더맵게 {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int a : scoville){
            pq.add(a);
        }

        int min = pq.peek();
        while (min < K){    //최솟값이 K이하일 때 종료
            if(pq.size() >= 2){
                pq.add(pq.poll() + (pq.poll() * 2));
                min = pq.peek();
                answer++;
            }
            else{
                return -1;
            }
        }

        return answer;
    }
}