//package com.gl.collectionframework;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListIterbaleDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
Iterator<Integer> itr=list.listIterator();
while(itr.hasNext()){
System.out.print(itr.next() +" ");
}
 System.out.println();
   }
}
