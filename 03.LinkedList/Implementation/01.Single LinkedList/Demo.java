class LinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }

    LinkedList() {
        head = null;
    }

    public void insertAtBegining(int val) {
        Node newnode = new Node(val);
        if (head == null) {
            head = newnode;
        } else {
            newnode.next = head;
            head = newnode;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void insertAtPos(int pos, int val) {
        if (pos == 0) {
            insertAtBegining(val);
            return;
        }
        Node newnode = new Node(val);
        Node temp = head;
        for (int i = 1; i < pos; i++) {
            temp = temp.next;
            if (temp == null) {
                // it is a naive approach
                // System.out.println("Invalid Position");
                // return;
                throw new IndexOutOfBoundsException("Invalid Pos " + pos);
            }
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }

    public void deleteAtPos(int pos) {
        if (head == null) {
            throw new IndexOutOfBoundsException("Deletion attempted on empty List ");
        }
        if (pos == 0) {
            deleteAtBeginning();
            return;
        }

        Node temp = head;
        Node prev = null;

        for (int i = 1; i <= pos; i++) {
            prev = temp;
            temp = temp.next;
            if (temp == null) {
                throw new IndexOutOfBoundsException("Invalid Pos " + pos);
            }
        }
        prev.next = temp.next;
    }

    public void deleteAtBeginning() {
        if (head == null) {
            throw new IndexOutOfBoundsException("Deletion attempted on empty List ");
        }
        head = head.next;
    }

    public void displayPosition(int pos){
        if(head==null){
            throw new IndexOutOfBoundsException("List is empty Nothing to display at position "+ pos);
        }
        Node temp=head;
        for(int i=1;i<pos;i++){
            temp=temp.next;
            if(temp==null){
                throw new IndexOutOfBoundsException("Invalid Position To Display "+pos);
            }
        }
        System.out.println(temp.data+" ");

    }
    public void updateData(int pos, int val) {
        if(head==null){
            throw new IndexOutOfBoundsException("List is empty Nothing to Update at position "+ pos);
        }
        Node temp=head;
        for(int i=1;i<pos;i++){
            temp=temp.next;
            if(temp==null){
                throw new IndexOutOfBoundsException("Invalid Position To Update "+pos);
            }
        }
        temp.data=val;       
    }

}

public class Demo {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.insertAtBegining(3);
        l1.insertAtBegining(2);
        l1.insertAtBegining(1);
        // l1.display();
        l1.insertAtPos(3, 4);
        // l1.display();

        // ! suppose the list is empty we get exception NuLinkedListPointerException
        // l1.deleteAtPos(0);
        // l1.display();
        l1.displayPosition(0);
        // l1.displayPosition(4);
        // l1.updateData(5,5);
        l1.display();
    }
}

/*
 * get(pos) -done
 * update(pos,val)
 * deleteEnd
 * insertAtEnd(val)
 * seacrh(val) -return index,-1
 * contains(val)-return true or false
 */
