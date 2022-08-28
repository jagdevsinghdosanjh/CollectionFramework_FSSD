//package com.gl.collectionframework;
import java.util.ArrayList;
import java.util.List;
public class ArrayListDemo{
    public static void main(String[] args) {
    ArrayList<Integer> list1=new ArrayList<>();
    List<Integer> list2= new ArrayList<>();
    System.out.println("List 1:"+list1 +"\nList 2:"+list2);
    list1.add(1);
    list1.add(2);
    list2.add(3);
    list2.add(4);
    System.out.println("List 1:"+list1 +"\nList 2:"+list2);
    list2.addAll(list1);
    System.out.println("List 1:"+list1 +"\nList 2:"+list2);
    }
}