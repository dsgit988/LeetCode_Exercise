public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;

        while (head.val == val){
            ListNode prev = head;
            head = head.next;
            prev.next = null;
        }
        ListNode currentNode = head;
        ListNode nextNode = currentNode.next;
        while (currentNode.next != null){
            if (nextNode.val == val){
                nextNode = nextNode.next;
                currentNode.next = nextNode;
            }else {
                currentNode = nextNode;
                nextNode = nextNode.next;
            }
        }

        return head;
    }
}
