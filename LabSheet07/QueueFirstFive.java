import java.util.ArrayDeque;
import java.util.Queue;

public class QueueFirstFive {

    public static void main(String[] args) {
        Queue<Integer> n_queue = new ArrayDeque<Integer>();

        int totalItems = 10;
        for (int i = 101; i <= 110; i++) {
            n_queue.add(i);
        }

        System.out.println("Queue => " + n_queue);

        for (int i = 1; i <= totalItems; i++) {
            int currentNumber = n_queue.poll();

            if (i <= 5) {
                System.out.println(currentNumber);
            }

            n_queue.add(currentNumber);
        }

        System.out.println("Queue => " + n_queue);
    }
}