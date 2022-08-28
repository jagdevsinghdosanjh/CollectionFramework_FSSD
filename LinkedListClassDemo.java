import java.util.*;

public class LinkedListClassDemo {

	public static void main(String[] args) {

		LinkedList<String> list_1 = new LinkedList<String>();
		LinkedList list_2 = new LinkedList();
		
		list_2.add(10);
		list_2.add(20);
		list_2.addFirst(5);
		list_2.addLast(25);
		list_2.offer(2);
		list_2.offerFirst(1);
		list_2.offerLast(10);
		list_2.push(40);
		
		list_1.addAll(list_2);
		
		System.out.println("List_1: " + list_1);
		
		System.out.println("List_2: " + list_2);
		
	}

}