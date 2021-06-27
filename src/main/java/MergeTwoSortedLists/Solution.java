package MergeTwoSortedLists;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Definition for singly-linked list.
 * public class MergeTwoSortedLists.ListNode {
 *     int val;
 *     MergeTwoSortedLists.ListNode next;
 *     MergeTwoSortedLists.ListNode() {}
 *     MergeTwoSortedLists.ListNode(int val) { this.val = val; }
 *     MergeTwoSortedLists.ListNode(int val, MergeTwoSortedLists.ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public static void main(String[] args) {
        ListNode l1 = null;
//        l1.next = new ListNode(2);
//        l1.next.next = new ListNode(4);
        ListNode l2 = null;
//        l2.next = new ListNode(3);
//        l2.next.next = new ListNode(4);

        ListNode l3 =  mergeTwoLists(l1,l2);

        System.out.println();

        while (l3 != null) {
            System.out.print(l3.val + ";");
            l3 = l3.next;
        }

    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {


        List<Integer> arrayList = new ArrayList<>();
        while (l1 != null){
            arrayList.add(l1.val);
            l1 = l1.next;
        }
        while (l2 != null){
            arrayList.add(l2.val);
            l2 = l2.next;
        }

        Collections.sort(arrayList);

        if(arrayList.isEmpty()){
            return null;
        }

        ListNode l3 = new ListNode(arrayList.get(arrayList.size()-1));

        for (int i = arrayList.size()-2; i >= 0 ; i--) {
            l3 = new ListNode(arrayList.get(i), l3);
        }

        return l3;
    }

}