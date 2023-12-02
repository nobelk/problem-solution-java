package org.app;

public class AddTwoNumbersUsingLinkedList {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        int carry = 0;
        int sum = 0;
        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;

        while(l1 != null || l2 != null || carry != 0){
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            sum = x + y + carry;
            carry = sum/10;
            sum = sum % 10;
            curr.next = new ListNode(sum);
            curr = curr.next;
            if(l1 !=null)
                l1 = l1.next;
            if(l2!=null)
                l2 = l2.next;
        }
        return dummyHead.next;
    }
}
