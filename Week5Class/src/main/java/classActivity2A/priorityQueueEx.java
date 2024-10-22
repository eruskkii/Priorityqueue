package classActivity2A;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class priorityQueueEx {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();

        queue.add("ONE");
        queue.add("TWO");
        queue.add("THREE");
        queue.add("FOUR");
        queue.add("FIVE");

        Iterator<String> iterator = queue.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
