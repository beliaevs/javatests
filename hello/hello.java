package hello;

import java.util.ArrayList;
import java.util.List;

public final class hello
{
    static int Uninitialized;
    public static void main(String[] args)
    {
        System.out.println("Hello!");
        System.out.println("f(2)=" + f(2));
        int n = 123;
        Integer m = n;
        System.out.println(m);
        List<Integer> l = new ArrayList<>();
        l.add(3);
        System.out.println(l);
        String s1 = new String("Hi");
        System.out.println(s1);
        Object obj = new Object();
        System.out.println(obj);

        System.out.println("arguments count: " + args.length);

        n = 100;
        int[] nums = new int[n];
        System.out.println("Uninitialized=" + Uninitialized);
    }

    static int f(int x)
    {
        return x*x;
    }
};