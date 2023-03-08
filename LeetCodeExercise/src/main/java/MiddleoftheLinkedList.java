public class MiddleoftheLinkedList {
    public ListNode middleNode(ListNode head) {
        if (head.next == null) return head;
        int count = 0;
        int n = 0;
        ListNode current = head;
        while (current != null){
            count++;
            current = current.next;
        }
        current = head;
        while (current != null){

                n++;

                if (count / 2 + 1 == n) return current;
                current = current.next;


        }

        return head;
    }
}
