package JavaAssignment6;

import java.util.*;
public class JavaAssignment6_1
{
    public static void main(String args[])
    {
        long count=100,n=1;
        while(count >0) {
            int v = 0;
            long  i, c = 0, f = 0, j = 0, x, k, p, c1, c2, b[] = new long[100];
            //Counting the number of digits
            for (i = n; i > 0; i /= 10)
                c++;
            if (c % 2 != 0)
                f = 1;
            else {
                for (i = (int) Math.pow(10, c / 2 - 1); i < (int) Math.pow(10, c / 2); i++) {
                    if (n % i == 0)
                    {
                        j = n / i;
                        if (!(j >= Math.pow(10, c / 2 - 1) && j < Math.pow(10, c / 2)))
                            f = 1;

                        x = i * (int) Math.pow(10, c / 2) + j;

                        if (i % 10 == 0 && j % 10 == 0) {
                            f = 1;
                            break;
                        }
                        else
                        {
                            f = 0;
                            for (k = n; k > 0; k /= 10) {
                                c1 = c2 = 0;
                                for (p = n; p > 0; p /= 10) {
                                    if (k % 10 == p % 10)
                                        c1++;
                                }
                                for (p = x; p > 0; p /= 10) {
                                    if (k % 10 == p % 10)
                                        c2++;
                                }
                                if (c1 != c2) {
                                    f = 1;
                                    break;
                                }
                            }
                            if (f == 0) {
                                int fl = 0;
                                for (int ii = 0; ii < v; ii++)
                                    if (b[ii] == i || b[ii] == j)
                                        fl = 1;
                                if (fl == 0)
                                    b[v++] = i;

                            }
                        }
                    }
                }

            }
            if(v!=0) {
                System.out.println(n);
                count--;
            }
            n++;
        }
    }
}