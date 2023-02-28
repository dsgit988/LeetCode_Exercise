import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int s: stones){
            queue.add(s);
        }


        while (queue.size() > 1){
            int head1 = queue.poll();
            int head2 = queue.poll();

            if (head1 != head2){
                queue.add(head1 - head2);
            }
        }
        if (queue.size() == 0) return 0;
        return queue.peek();
    }
}
