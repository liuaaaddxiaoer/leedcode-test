import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static sun.swing.MenuItemLayoutHelper.max;

/**
 * Created by lin on 2018/10/16.
 */
public class AddTwoNumbers {

    public static void main(String[] args) {
//        int a[] = {1,2,3};
//        int b[] = {4,5,6};
//        AddTwoNumbers.addTwoNumbers(a,b);
       ListNode l1 = new ListNode(15);
       ListNode l2 = new ListNode(16);
        AddTwoNumbers.addTwoNumbers1(l1,l2);
        List list1 = new ArrayList();
        list1.add(8);
        list1.add(2);
        list1.add(3);
        List list2 = new ArrayList();
        list2.add(5);
        list2.add(2);
       // AddTwoNumbers.addTwoNumbers(list1, list2);
    }

    public static int addTwoNumbers(List l1, List l2) {
        int l = Math.max(l1.size(), l2.size());
        int r = 0;
        for (int i = l - 1; i >= 0; i--) {
            int a = 0;
            int b = 0;
            if(i<l1.size()){
                a = (Integer) l1.get(i);
            }else {
                a = (Integer) l1.get(l1.size()-1);
            }

            b = (Integer)((l2.get(i) != null) ? l2.get(i) : 0);

            int m = a+b;
            System.out.println(m);
            r += Math.pow(10, i) * m;
        }
        System.out.println(r);
        return r;
    }

    public static ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        System.out.println(dummyHead.val);
        return dummyHead.next;
    }



//     public static int addTwoNumbers(int a[],int b[]){
//        int l = max(a.length,b.length);
//        int r = 0;
//        for(int i=l-1;i>=0;i--){
//            int m = a[i] + b[i];
//            System.out.println(m);
//            r += Math.pow(10,i)*m;
//        }
//         System.out.println(r);
//        return r;
//     }

}


 class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}