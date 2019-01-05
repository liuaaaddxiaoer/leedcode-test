/**
 * Created by lin on 2019/1/3.
 */
public class Reversal {
    public static int reversal_2(int n) {
        int temp = 0;
        int m = 0;

        while(n!=0) {
            m = m * 10 + n % 10;
            if(temp != m/10) {
                return 0;
            }
            temp = m;
            n = n/10;
        }
        return m;
    }

        public static int reverse(int x) {
            int rev = 0;
            while (x != 0) {
                int pop = x % 10;
                x /= 10;
                if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
                if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
                rev = rev * 10 + pop;
            }
            return rev;
    }

    public static void main(String[] args) {
        int a = Reversal.reversal_2(2147483647);
        System.out.println(a);
    }
}
