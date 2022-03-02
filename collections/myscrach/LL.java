package com.company.collections.myscrach;

public class LL {

    Node head;
    private int size;

    LL(){
        this.size = 0;
    }

    class Node {             //Node  comprises of -->  | data | next-Node |

        String data;
        Node next;

        Node(String data) {                // one node created!
            this.data = data;
            this.next = null;
            size++;
        }
    }

    //add --> add First
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //add --> add Last
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    //Print out the list
    public void printList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    //delete --> delete First
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }

        size--;
        head = head.next;
    }

    //delete --> delete Last
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }
        Node secondNode = head;
        Node lastNode = head.next;        // if  head.next = null;   -->  one node only in list
        while(lastNode.next != null){      // null.next !!!!!   -->  error
            lastNode = lastNode.next;
            secondNode = secondNode.next;
        }
        secondNode.next = null;
    }

    //Get Size of list


    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("apple");
        list.addFirst("An");
        list.printList();
        list.addLast("a");
        list.printList();
        list.addLast("day");
        list.printList();

        list.deleteFirst();
        list.printList();
        list.deleteLast();
        list.printList();

        list.deleteLast();
        list.addLast("keeps");
        list.addLast("doctor");
        list.addFirst("An");
        list.addLast("away.");
        list.printList();
        System.out.println(list.getSize());


    }
}
