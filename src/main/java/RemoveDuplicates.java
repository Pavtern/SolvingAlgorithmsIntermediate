import java.util.ArrayList;

public class RemoveDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode current = head;
        while (current.next != null){
            if(current.val != current.next.val){
                current = current.next;
            } else if(current.next.next != null) {
                current.next = current.next.next;
            } else {
                current.next = null;
            }

        }

        return head;
    }
}


/*
ArrayList<Integer> arr = new ArrayList<>();
    ListNode current = new ListNode(head.val, head.next);
    boolean flag = false;
        while (current.next != null){
                if (head.val == head.next.val){
                current = head.next;
                flag = false;
                } else {
                arr.add(current.val);
                current = current.next;
                flag = true;
                }
                }
                if (flag) arr.add(current.val);
                ListNode result = null;
                for (int i = arr.size() - 2; i > -1; i--) {
                result = new ListNode(arr.get(i), result);
                }
*/
