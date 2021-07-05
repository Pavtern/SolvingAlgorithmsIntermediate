import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddTwoNumbersTest {

    @Test
    public void addTwoNumbers() {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode l1 = new ListNode(9);
        l1.next = new ListNode(8);



        ListNode l2 = new ListNode(1);
//        l2.next = new ListNode(9);
//        l2.next = new ListNode(9);
//        l2.next = new ListNode(9);

        ListNode l3 = new ListNode(0, new ListNode(2));


        Assert.assertEquals(addTwoNumbers.addTwoNumbers(l1,l2), l3);
    }
}