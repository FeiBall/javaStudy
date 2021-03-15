package leetcode_day1;

/**
 * @author 冯若航
 * @version 1.0
 * @description: TODO 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 *
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 *
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * @date 2021/3/6 18:18
 */
public class Q2 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);//虚拟头节点
        ListNode cur = head;//指针指向头节点
        int carry = 0;//进位值
        while (l1 != null || l2 != null) {//两个链表均为空时停止遍历
            int x = (l1 != null) ? l1.val : 0;//x为l1的值，如果节点为空，值为0
            int y = (l2 != null) ? l2.val : 0;//y为l2的值，如果节点为空，值为0
            int sum = carry + x + y;//sum为两节点值之和
            carry = sum / 10;//得进位值（1）
            cur.next = new ListNode(sum % 10);//sum%10 得余数即 个位数的值
            cur = cur.next;//刷新指针
            if (l1 != null) l1 = l1.next;//l1节点不为空继续刷新下一个节点
            if (l2 != null) l2 = l2.next;//l2节点不为空继续刷新下一个节点
        }
        if (carry > 0) {//如果仍然需要进 1 ，则直接新建一个节点
            cur.next = new ListNode(carry);
        }
        return head.next;
    }
}
