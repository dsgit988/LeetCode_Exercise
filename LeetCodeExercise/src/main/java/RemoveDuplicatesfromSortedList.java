public class RemoveDuplicatesfromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        if (head == null) return null;
        ListNode nextNode = curr.next;

        while (curr.next != null){
            if (curr.val != nextNode.val){
                curr = curr.next;
                nextNode = nextNode.next;
            }else {
                nextNode =nextNode.next;
                curr.next = nextNode;
            }
        }
        return head;
    }
}
