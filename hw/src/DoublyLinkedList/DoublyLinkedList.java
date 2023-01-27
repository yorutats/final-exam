/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Week8
//完成Doubly Linked List新增和刪除元素
//用Stack來完成迷宮題目(回溯)

package DoublyLinkedList;

import java.util.NoSuchElementException;

/**
 *
 * @author s2000
 */
class Node {
    int data;
    Node prev;
    Node next;

    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class DoublyLinkedList {
    Node head;
    Node tail;
    int size;

    public DoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void deleteFirst() {
        if (head == null) {
            throw new NoSuchElementException("Linked list is empty");
        }
        head = head.next;
        if (head != null) {
            head.prev = null;
        } else {
            tail = null;
        }
        size--;
    }

    public void deleteLast() {
        if (tail == null) {
            throw new NoSuchElementException("Linked list is empty");
        }
        tail = tail.prev;
        if (tail != null) {
            tail.next = null;
        } else {
            head = null;
        }
        size--;
    }

    public int getSize() {
        return size;
    }

    public class main {
        public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.addFirst(1);
        dll.addLast(2);
        dll.addLast(3);
        dll.addLast(4);
        System.out.println("Size: " + dll.getSize()); // Size: 4
        dll.deleteFirst();
        dll.deleteLast();
        System.out.println("Size: " + dll.getSize()); // Size: 2
        }
        }
}
