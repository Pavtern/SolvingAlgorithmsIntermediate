
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null){
            return null;
        }
        ListNode result = new ListNode();
        boolean isFirstNode = true;
        int sum = 0;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            if(l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            sum += carry;
            if (sum > 9){
                add(result,sum - 10, isFirstNode);
                carry = 1;
                isFirstNode = false;
            }else{
                carry = 0;
                add(result, sum, isFirstNode);
                isFirstNode = false;
            }
            sum = 0;
        }

        return result;
    }

    private void add(ListNode listNode, int value, boolean isFirstNode){
        if(isFirstNode){
            listNode.val = value;
            return;
        }
        ListNode currentNode = listNode;
        while (currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = new ListNode(value);
    }

}


