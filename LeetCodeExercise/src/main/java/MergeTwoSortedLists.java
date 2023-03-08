import java.util.LinkedList;
import java.util.TreeMap;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode beforeHead = new ListNode();

        ListNode before = beforeHead;

        while (list1 != null && list2 != null){
            if (list1.val <= list2.val){
                before.next = list1;
                before = list1;
                list1 = list1.next;
            }else {
                before.next = list2;
                before = list2;
                list2 = list2.next;
            }
        }

        before.next = list1 == null? list2: list1;
        return beforeHead.next;



    }
}
