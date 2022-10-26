public class Student {
    static class Mark {
        private final String markName;
        private final int mark;
        public Mark next;
        public Mark prev;

        public Mark(String markName, int mark) {
            this.markName = markName;
            this.mark = mark;
        }
    }

    public String name;
    private Mark head;
    private Mark tail;

    public Student(String name) {
        this.name = name;
        head = null;
        tail = null;
    }

    private boolean isEmpty() {
        return head == null;
    }

    public void addMark(String markName, int mark) {
        Mark temp = new Mark(markName, mark);
        if (isEmpty()) {
            tail = temp;
        } else {
            head.prev = temp;
        }
        temp.next = head;
        head = temp;
    }

    public void overwriting(String markName, int mark) {
        Mark cur = head;
        int i = 0;
        while (!cur.markName.equals(markName)) {
            i++;
            cur = cur.next;
            if (cur == null) {
                return;
            }
        }
        if (cur == head) {
            dellFirst();
        } else {
            cur.prev.next = cur.next;
        }
        if (cur == tail) {
            dellLast();
        } else {
            cur.next.prev = cur.prev;
        }
        addByIndex(markName, mark, i);

    }

    private void addByIndex(String markName, int mark, int index) {
        Mark cur = head;
        int i = 0;
        while (cur != null && i != index) {
            cur = cur.next;
            i++;
        }
        Mark temp = new Mark(markName, mark);
        cur.prev.next = temp;
        temp.prev = cur.prev;
        cur.prev = temp;
        temp.next = cur;
    }

    private void dellFirst() {
        if (head.next == null) {
            tail = null;
        } else {
            head.next.prev = null;
        }
        head = head.next;
    }

    private void dellLast() {
        if (head.next == null) {
            tail = null;
        } else {
            tail.prev.next = null;
        }
        tail = tail.prev;
    }

    public void dellByIndex(String index) {
        Mark cur = head;
        //int i = 0;
        while (!cur.markName.equals(index)) {
            cur = cur.next;
            if (cur == null) {
                return;
            }
        }
        if (cur == head) {
            dellFirst();
        } else {
            cur.prev.next = cur.next;
        }
        if (cur == tail) dellLast();
        else cur.next.prev = cur.prev;
    }

    public void print() {
        Mark temp = head;
        System.out.println(name);
        while (temp != null) {
            System.out.println(temp.markName + ": " + temp.mark);
            temp = temp.next;
        }
    }

    public void printDiscipline(String name_) {
        Mark temp = head;
        while (temp != null) {
            if (temp.markName.equals(name_)) {
                System.out.println(name + " " + temp.markName + ": " + temp.mark);
            }
            temp = temp.next;
        }
    }
}
