package LinkedList;
public class basics {
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

    // print the list
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
        print();  // 10 -> 20 -> 30 -> 40 -> null
        remove_head();
        print();
        add_first(100);
        print();
        add_last(90);
        print();
        remove_tail();
        print();
        add_between(70,30 );
        print();
        remove_between(20);
        print();



    // add element at first

    }
    static void add_first(int data){
        Node t=new Node(data,null);
        t.next=head;
        head=t;
    }


    // add element at last



    static void add_last(int data){
        Node t=new Node(data,null);
        if(head == null){             
            head = t;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=t;
    }


    //remove head



    static void remove_head(){
        if(head == null) return;  
        head=head.next;
        return;
    }

    // removve the tail


    static void remove_tail(){
        if(head == null) return;  
        if(head.next == null){        
        head = null;
        return;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;

    }

    // add in between 


    static void add_between(int data,int after){
        if(head == null) return; 
        Node temp=head;
        while(temp.next!=null){
            if(temp.data==after){
                Node t=new Node(data,temp.next);
                temp.next=t;
            }
            temp=temp.next;
        }
    }


    //remove in between



    static void remove_between(int after){
        Node temp=head;
        while(temp.next!=null){
            if(temp.data==after){
                temp.next=temp.next.next;
                return;
            }
            temp=temp.next;
        }
    }
    
}
