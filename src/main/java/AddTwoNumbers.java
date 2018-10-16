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
        //ListNode list1 = new ListNode(1);
        List list1 = new ArrayList();
        list1.add(8);
        list1.add(2);
        list1.add(3);
        List list2 = new ArrayList();
        list2.add(5);
        list2.add(2);
        AddTwoNumbers.addTwoNumbers(list1, list2);
    }

    public static int addTwoNumbers(List l1, List l2) {
        int l = Math.max(l1.size(), l2.size());
        int r = 0;
        for (int i = l - 1; i >= 0; i--) {
            int a = 0;
            int b = 0;
            if(i<l1.size()){
                a = (Integer) l1.get(i);
            }
            if(i<l1.size()){
                b = (Integer) l1.get(i);
            }
            int m = a+b;
            System.out.println(m);
            r += Math.pow(10, i) * m;
        }
        System.out.println(r);
        return r;
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