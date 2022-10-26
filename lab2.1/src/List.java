public class List {
    private Node head;
    private Node tail;

    public List() {
        head = null;
        tail = null;
    }
    public List(int date) {
        head = null;
        tail = null;
        Node temp = new Node(date);
        if (isEmpty()) {
            tail = temp;
        } else {
            head.prev = temp;
        }
        temp.next = head;
        head = temp;
    }

    private boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int date) {
        Node temp = new Node(date);
        if (isEmpty()) {
            tail = temp;
        } else {
            head.prev = temp;
        }
        temp.next = head;
        head = temp;
    }



    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.date);
            temp = temp.next;
        }
    }

    public void addLast(int date) {
        Node temp = new Node(date);
        if (isEmpty()) {
            head = temp;
        } else {
            tail.next = temp;
        }
        temp.prev = tail;
        tail = temp;
    }

    public void addByIndex(int date, int index) {
        Node cur = head;
        int i = 0;
        while (cur != null && i != index) {
            cur = cur.next;
            i++;
        }
        Node temp = new Node(date);


        cur.prev.next = temp;

        temp.prev=cur.prev;
        cur.prev=temp;
        temp.next = cur;
    }
    public void removeFirst(){
        Node temp = head;
        if(head.next == null){
            tail = null;
        }else {
            head.next.prev = null;
        }
        head = head.next;
    }
    public void removeLast() {
        if (head.next ==null) {
            tail = null;
        } else {
            tail.prev.next = null;
        }
        tail = tail.prev;
    }
}
