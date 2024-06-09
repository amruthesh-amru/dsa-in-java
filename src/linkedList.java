
public class linkedList {
        Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null ;
        }
    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }
    public void printList(){
        Node currNode = head;
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        while(currNode != null){
            System.out.print(currNode.data+ "->");
            currNode = currNode.next;
        }
        System.out.print("null");
    }
        public void addLast(int data){
            Node newNode = new Node(data);
            if(head==null){
                head = newNode;
                return;
            }
            Node currNode = head;
            while(currNode.next != null){
                currNode = currNode.next;
            }
            currNode.next = newNode;
        }
        public void deleteFirst(){
            if(head==null){
                System.out.println("list is empty");
                return;
            }
        //brute
//            Node currNode = head;
//            head = currNode.next;
            //better
            head=head.next;
        }
        public void deleteLast(){
            if(head==null){
                System.out.println("list is empty");
                return;
            }
            if(head.next==null){
                head=null;
                return;
            }
            Node secondlastNode = head;
            Node lastNode = head.next;
            while(lastNode.next != null){
                lastNode = lastNode.next;
                secondlastNode = secondlastNode.next;
            }
            secondlastNode.next=null;
        }
    public static void main(String[] args) {
        linkedList list = new linkedList();
        list.addFirst(2);
        list.addFirst(1);
        list.addFirst(6);
        list.deleteLast();
        list.printList();
    }
}
