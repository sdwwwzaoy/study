package com.example.jvm_1_memory.stringTable;

public class StringTest {

    public static void main(String[] args) {
        int i = 0;
        try {
            //放入串池10000个
            for (int j = 0; j < 10000; j++) {
                String.valueOf(j).intern();
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println(i);
        }
    }

}
