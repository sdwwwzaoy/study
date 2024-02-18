package com.example.jvm_1_memory.heap;

import java.util.ArrayList;
import java.util.List;

public class HeapTest {

    public static void main(String[] args) {
        int i = 0;
        try {
            List<String> list = new ArrayList<String>();
            String a = "hello";
            while (true) {
                list.add(a);
                a = a + a;
                i++;
            }
        } catch (Throwable t) {
            t.printStackTrace();
            System.out.println(i);
        }

    }

}
