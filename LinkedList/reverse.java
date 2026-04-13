package LinkedList;
import java.util.*;
public class reverse {
    static class Node{
        int data;
        Node next;
        Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    static Node head = null;

    // add node at end
    static void add(int data){
        Node newNode = new Node(data, null);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    static void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null\n");
    }
    

    public static void main(String args[]){
        add(10);
        add(20);
        add(30);
        add(40);
        reverse();
        print();  
    }
    static void reverse(){
        Node prev=null;
        Node curr=head;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
}
