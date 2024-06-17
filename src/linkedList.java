
public class linkedList {
        Node head;
        private int size;

        linkedList(){
            this.size=0;
        }
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null ;
            size++;
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
            size--;
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
            size--;
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
        public int getSize(){
            return size;
        }
        public void reverseList(){

            Node prev = null;
            Node current = head;
            while(current != null){
                Node tempNext  = current.next;
                current.next = prev;
                prev = current;
                current = tempNext;
            }
            System.out.println("new head"+ prev.data);
        }
        public void findMiddleNode(){
            //optimal tortoise appraoch
            Node slow = head;
            Node fast = head;
            while(fast!=null && fast.next!=null){
                fast = fast.next.next;
                slow = slow.next;
            }
            System.out.println();
            System.out.println(slow.data);

            //brute approach
            int length = 0;
            Node currNode = head;
            while(currNode != null){
                currNode = currNode.next;
                length++;
            }
            currNode = head;
            int i=1;
            while(i != length/2 +1){
                currNode = currNode.next;
                i++;
            }
            System.out.println(currNode.data);
        }
    public static void main(String[] args) {
        linkedList list = new linkedList();
        list.addFirst(2);
        list.addFirst(1);
        list.addFirst(6);
        list.addFirst(55);
        list.addFirst(5);
        list.addFirst(9);
       list.printList();
       list.findMiddleNode();
    }
}
