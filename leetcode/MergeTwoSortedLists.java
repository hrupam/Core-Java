package leetcode;


import leetcode.linkedlist.ListNode;
import utility.LLUtil;

public class MergeTwoSortedLists {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode templ1 = l1;
        ListNode templ2 = l2;
        ListNode result = null;
        ListNode resultPtr = null;
        while (templ1 != null && templ2 != null) {
            if (templ1.val <= templ2.val) {
                if (result == null) {
                    result = new ListNode(templ1.val);
                    resultPtr = result;
                } else {
                    result.next = new ListNode(templ1.val);
                    result = result.next;
                }
                templ1 = templ1.next;
            } else {
                if (result == null) {
                    result = new ListNode(templ2.val);
                    resultPtr = result;
                } else {
                    result.next = new ListNode(templ2.val);
                    result = result.next;
                }
                templ2 = templ2.next;
            }
        }
        while (templ1 != null) {
            if (result == null) {
                result = new ListNode(templ1.val);
                resultPtr = result;
            } else {
                result.next = new ListNode(templ1.val);
                result = result.next;

            }
            templ1 = templ1.next;

        }
        while (templ2 != null) {
            if (result == null) {
                result = new ListNode(templ2.val);
                resultPtr = result;
            } else {
                result.next = new ListNode(templ2.val);
                result = result.next;

            }
            templ2 = templ2.next;

        }
        return resultPtr;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode result = mergeTwoLists(l1, l2);

        LLUtil.displayLinkedList(result);
    }
}
