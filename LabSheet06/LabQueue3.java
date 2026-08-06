import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class LabQueue3 {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        
        System.out.println("Before reverse => " + queue);
        
        reverse(queue);
        
        System.out.println("After  reverse => " + queue);
    }

    public static void reverse(Queue<Integer> queue) {
        Deque<Integer> stack = new LinkedList<>();

        while (!queue.isEmpty()) {
            int currentData = queue.poll(); 
            stack.push(currentData);        
        }

        while (!stack.isEmpty()) {
            int popData = stack.pop();     
            queue.add(popData);             
        }
    }
}