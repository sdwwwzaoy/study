package integer;

public class IntegerTest {


    public static void main(String[] args) {
        System.out.println(divide(Integer.MAX_VALUE, 1));
    }

    public static int divide(int a, int b) {
        boolean flag = (a < 0 && b < 0) || (a > 0 && b > 0);
        a = Math.abs(a);
        b = Math.abs(b);
        int res = 0;
        while (a >= b) {
            int tmp = b;
            int count = 0;
            while (a >= tmp) {
                tmp = tmp << 1;
                count++;
            }
            count--;
            a -= b << count;
            res += 1 << count;
        }
        return flag ? res : -res;
    }


}


