import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Collections;

public class RemoveDuplicatesTest extends TestCase {

    public void testDeleteDuplicates() {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 1, 2);

        ArrayList<Integer> list2 = new ArrayList<>();
        Collections.addAll(list2, 1, 2);

        ListNode listNode = createListNode(list);
        ListNode listNode2 = createListNode(list2);

        RemoveDuplicates removeDuplicates = new RemoveDuplicates();

        ListNode result = removeDuplicates.deleteDuplicates(listNode);
        boolean control = true;

        while (control && listNode2.next != null && result.next != null) {
            if (listNode2.val != result.val) control = false;
            listNode2 = listNode.next;
            result = result.next;
        }
        if (control && listNode2.val == result.val) {
            System.out.println("Result is as expected");
        } else {
            System.out.println("Result is wrong");
        }
    }

    public static ListNode createListNode(ArrayList<Integer> arr) {
        if (arr == null || arr.isEmpty()) {
            return null;
        }

        ListNode head = new ListNode(arr.get(0));
        ListNode current = head;
        for (int i = 1; i < arr.size(); i++) {
            current.next = new ListNode(arr.get(i));
            current = current.next;
        }

        return head;
    }
}