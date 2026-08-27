

public class LinkedList {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;


    // function for adding at first.
    public void addFirst(int data){          // TC=O(1)
        // step1 - create new node
        Node newNode = new Node(data);
        size++;
        
        if(head == null){
            head = tail = newNode;
            return ;
        }
        
        // step 2 - newNode next = head
        newNode.next = head;    //link

        // step 3 - head = newNode
        head = newNode;
    }



    // add node at last 
    public void addLast(int data){

        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
            return;
        }

        tail.next = newNode;

        tail = newNode;
    }

    //printing linked list
    public void print(){        // O(n)
        if(head == null){
            System.out.println("linked list is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data +"->");
            temp = temp.next; 
        }
        System.out.println("null");
    }

    // removing first
    public int removeFirst(){
        if(size == 0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }


    // Removing last from ll
    public int removeLast(){
        if(size == 0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        //prev : i = size - 2
        Node prev = head;
        for(int i = 0 ; i< size-2 ; i++){
            prev = prev.next;
        }

        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }


    // Add a node in the Middle
    public void add(int idx,int data){

        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;
        while(i < idx-1){
            temp = temp.next;
            i++;
        }
        // i = idx-1 ; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;

    }


    // Question 1:- iterative search (search a key).
    public int itrsearch(int key){

        Node temp = head;
        int i = 0;
        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        // key not found
        return -1;
    }



    // Question 2 :- Recursive Search
    public int helper(Node head,int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next,key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
        return helper(head,key);
    }




    // Question 3 :- Reversing linkedlist
    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev =curr;
            curr = next;
        }
        head = prev;

    }



    // Question 4 :- Removing Nth node from End
    public void deleteNthfromEnd(int n){
        // calculate size
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }

        if(n == sz){
            head = head.next; // remove element
            return;
        }

        // sz - n
        int i = 1;
        int iToFind = sz - n;
        Node prev = head;
        while(i < iToFind){
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;

    }


    //Question 5 :- check is Linked list is Pallindrome.
    
    //Slow-Fast apporach.
    public Node findMid(Node head){     // helper function
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;       //+1
            fast = fast.next.next;  //+2
        }
        return slow;        // slow is my midNode.
    }

    public boolean checkPallindrome(){

        if (head == null || head.next == null){
            return true;
        }
        // step1 - find mid
        Node midNode = findMid(head);

        //step2 - reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev ;//right half head
        Node left = head ;

        // step3 - check left half and right half

        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }





    public static void main(String args[]){

        LinkedList ll = new LinkedList();

        // ll.head = new Node(1);
        // ll.head.next = new Node(2);


        // methods for adding and deletions and etc from linked list. add() , remove() , print() , search().

        // ll.addFirst(2);

        // ll.print();

        // ll.addFirst(1);

        // ll.print();

        // ll.addLast(3);

        // ll.print();

        // ll.addLast(4);

        // ll.print();

        // ll.add(2,9);

        // ll.print();

        // System.out.println(size);

        // int a = ll.removeFirst();

        // System.out.println(a);

        // ll.print();

        // ll.removeLast();

        // ll.print();







        // for Question 1 :- (iterative serch)

        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(4);
        // ll.addLast(5);
        // ll.add(2,3);

        // ll.print();

        // System.out.println(ll.itrsearch(3));
        // System.out.println(ll.itrsearch(4));


        // for Question 2:- (recursive search)
        // System.out.println(ll.recSearch(3));
        // System.out.println(ll.recSearch(10));



        // for Question 3:-(reversing LinkedList)

        // ll.reverse();
        // ll.print();
        

        //for Question 4:- (find & Remove Nth node from End)

        // ll.print();
        // ll.deleteNthfromEnd(3);
        // ll.print();

        //for Question 5 :- (check if a list is Pallindrome.)

        // ll.addLast(1);
        // ll.addLast(2);
        // ll.addLast(1);
        // ll.addLast(3);
        // ll.addLast(1);

        // ll.print();

        // System.out.println(ll.checkPallindrome());




    }

}
