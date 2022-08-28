import java.util.Iterator;
import java.util.PriorityQueue;
public class PriorityQueueDemo {
        public static void main(String[] args) {
        PriorityQueue<String> queue=new PriorityQueue<>();
        System.out.println(queue);
        queue.add("Jagdev Singh");
        queue.add("Kawaljit Kaur");
        queue.add("Inderjit Singh");
        queue.add("Jaswant Kaur");
        queue.add("Sarbjit Singh");
        queue.add("Jagdeep Kaur");
        queue.add("Aiknoor Kaur");
        System.out.println(queue);
        System.out.println("Head of the queue:"+queue.element());
        System.out.println("Head of the Queue:"+queue.peek());
        Iterator itr = queue.iterator();
     while(itr.hasNext()){
        System.out.print(itr.next()+" ");
     }
     System.out.println();
PriorityQueue<String> copyqueue =new PriorityQueue<>();
copyqueue=queue;
System.out.println("Elements are now from Copied Queue:"+copyqueue);
copyqueue.poll();
System.out.println("Elements from Copied Queue after poll method acted are:"+copyqueue);

    }
    }
