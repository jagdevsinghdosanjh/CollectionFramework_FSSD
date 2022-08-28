import java.util.LinkedList;
public class LinkedListDemo {
public static void main(String[] args) {
LinkedList<Integer> list=new LinkedList<>();
System.out.println("List: "+list);
//System.out.println(list.getFirst());//Throws Exception in threa "main" java.util.NoSuchElementException
System.out.println(list.peek());//Results Null
    list.add(1);
    list.add(2);
    System.out.println(list);
    list.add(0,3);
    System.out.println(list);
    list.addFirst(0);
    System.out.println(list);
    list.add(1,7);
    System.out.println(list);


    }
}    