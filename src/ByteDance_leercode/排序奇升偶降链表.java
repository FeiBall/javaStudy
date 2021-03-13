package ByteDance_leercode;

/**
 * @author 冯若航
 * @version 1.0
 * @description: TODO
 * @date 2021/3/13 11:10
 */
public class 排序奇升偶降链表 {
    /**
     * 定义链表
     */
    public static class Node{
        int val;
        Node next;
        Node(int val){this.val=val;}
    }


    /**
     * 按照奇偶位分成2个链表 比如1 8 3 4拆分为 1 3和8 4
     */
    public static Node[] getLists(Node head){
        Node head1=null;//奇数链表的头结点
        Node head2=null;

        Node cur1=null;//奇数链表的末尾节点
        Node cur2=null;
        int count=1;//用于计数
        while (head!=null){
            if(count%2==1){//处理奇数节点
                if(cur1!=null){
                    cur1.next=head;//末尾节点指向下一个几点
                    cur1=cur1.next;//末尾节点滑动到下一个节点
                }else{
                    cur1=head;
                    head1=cur1;
                }
            }else{//处理偶数节点
                if(cur2 != null){
                    cur2.next = head;
                    cur2 = cur2.next;
                }else{
                    cur2 = head;
                    head2 = cur2;
                }
            }
            head = head.next;
            count++;
        }

        //跳出循环，要让最后两个末尾元素的下一个都指向null
        cur1.next = null;
        cur2.next = null;

        Node[] nodes = new Node[]{head1, head2};
        return nodes;
    }

    /**
     * 翻转链表
     */
    static Node reverse(Node head){
        if(head==null||head.next==null) return head;
        Node last=reverse(head.next);
        head.next.next=head;
        head.next=null;
        return last;
    }

    /**
     * 合并有序链表
     * @param head1
     * @param head2
     * @return
     */
    public static Node CombineList(Node head1, Node head2){
        if(head1==null||head2==null){
            return head1!=null?head1:head2;
        }

        Node head=head1.val<head2.val?head1:head2;//新链表的头结点指向最小的头结点

        Node cur1=head==head1?head1:head2;//分别指向奇偶链表的头结点
        Node cur2=head==head1?head1:head2;

        Node pre=null;
        Node next=null;

        while(cur1!=null&&cur2!=null){
            if(cur1.val <= cur2.val){//这里一定要有=，否则一旦cur1的value和cur2的value相等的话，下面的pre.next会出现空指针异常
                pre = cur1;
                cur1 = cur1.next;
            }else{
                next = cur2.next;
                pre.next = cur2;
                cur2.next = cur1;
                pre = cur2;
                cur2 = next;
            }
        }
        pre.next = cur1 == null ? cur2 : cur1;

        return head;
    }

    /**
     * 递归合并链表
     * @param head1
     * @param head2
     * @return
     */
    public static Node MergeList(Node head1, Node head2){
        if(head1==null||head2==null){
            return head1!=null?head1:head2;
        }

        if(head1.val<head2.val){
            head1.next=MergeList(head1.next,head2);
            return head1;
        }else{
            head2.next=MergeList(head1,head2.next);
            return head2;
        }
    }




    public static void main(String[] args) {
        Node head = init();
        Node[] lists = getLists(head);

        Node head1 = lists[0];
        Node head2 = lists[1];
        head2 = reverse(head2);

//        head = CombineList(head1, head2);
        head  =MergeList(head1,head2);
        while(head != null){
            System.out.print(head.val+" ");
            head = head.next;
        }
    }

    public static Node init(){
        Node node1 = new Node(1);
        Node node2 = new Node(8);
        Node node3 = new Node(3);
        Node node4 = new Node(6);
        Node node5 = new Node(5);
        Node node6 = new Node(4);
        Node node7 = new Node(7);
        Node node8 = new Node(2);
        Node node9 = new Node(9);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;
        return node1;
    }


}
