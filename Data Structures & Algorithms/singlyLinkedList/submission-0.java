class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedList {
    Node head;
    int size;
    public LinkedList() {
        head=null;
        size=0;
    }

    public int get(int index) {
        if(index < 0 || index >= size){
            return -1;
        }
        Node cur=head;
        int i=0;
        while(i<index){
            cur=cur.next;
            i++;
        }
        return cur.data;
    }

    public void insertHead(int val) {
        Node newnode=new Node(val);
        newnode.next=head;
        head=newnode;
        size++;
    }

    public void insertTail(int val) {
    Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }

        size++;
        }

    public boolean remove(int index) {
        if(index < 0 || index >= size){
            return false;
        }
        if (index == 0) {
        head = head.next;
        size--;
        return true;
    }
    Node curr = head;
    int i = 0;
    while (i < index - 1) {
        curr = curr.next;
        i++;
    }

    curr.next = curr.next.next;
    size--;
    return true;


    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> arr = new ArrayList<>();
        Node curr = head;

        while (curr != null) {
            arr.add(curr.data);
            curr = curr.next;
        }

        return arr;
    }
}