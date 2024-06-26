package org.example.linked_list;

public class LinkedList<T> {

  private Node<T> head;
  private Node<T> tail;
  private int length;

  public LinkedList(){
    this.head = null;
    this.tail = null;
    this.length = 0;
  }

  public void append(T data){
    Node<T> newNode = new Node<>(data);
    if(head ==null){
      head = newNode;
      tail = newNode;
    }else{
      tail.next = newNode;
      tail = newNode;
    }
    length++;
  }

  public Node<T> removeLast(){
    if(length == 0){
      return null;
    }

    Node<T> temp = head;

    while(temp.next != tail && temp.next != null){
      temp = temp.next;
    }
    Node<T> removedNode = temp == head ? temp : temp.next;

    tail = temp;
    tail.next = null;
    length--;

    if(length == 0){
      head = null;
      tail = null;
    }
    return removedNode;
  }

  public void prepend(T data){
    Node<T> newNode = new Node<>(data);

    if(length == 0){
      head = newNode;
      tail = newNode;
    }else{
      newNode.next = head;
      head = newNode;
    }
    length++;
  }

  public Node<T> removeFirst(){
    if(length == 0){
      return  null;
    }
    Node<T> removedNode = head;
    head = head.next;
    removedNode.next = null;
    length--;
    if(length == 0){
      head = null;
      tail=null;
    }
    return removedNode;
  }

  public Node<T> get(int index){
    if(index >= length || index < 0){
      throw new NullPointerException();
    }

    Node<T> temp = head;
    int currentPosition = 0;
    while(currentPosition != index){
      currentPosition++;
      temp = temp.next;
    }
    return temp;
  }

  public void printList(){
    Node<T> temp = head;
    for (int i = 0; i<length; i++){
      System.out.println(temp.data);
      temp = temp.next;
    }
  }



}
