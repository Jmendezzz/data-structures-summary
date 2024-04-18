package org.example.linked_list;

public class Main {
  public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<>();
    list.append(1);
    System.out.println(list.get(0).data);
    list.removeLast();
    list.printList();

  }
}
