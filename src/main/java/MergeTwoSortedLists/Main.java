package MergeTwoSortedLists;

public class Main {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(4);
        while (l1 != null){
            System.out.println(l1.val);
            l1 = l1.next;
        }
        ListNode l5 = new ListNode();
        System.out.println(l5.val);

    }
}
