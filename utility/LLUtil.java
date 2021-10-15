package utility;

import leetcode.linkedlist.ListNode;

public class LLUtil {
    public static void displayLinkedList(ListNode list) {
        String result = "";
        if (list != null) {
            while (list.next != null) {
                result = result + list.val + ", ";
                list = list.next;
            }
            result += list.val;
        }
        System.out.print(result);


    }
}
