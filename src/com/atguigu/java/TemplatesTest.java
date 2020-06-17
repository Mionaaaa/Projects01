package com.atguigu.java;

import com.atguigu.bean.Customer;

import java.util.ArrayList;
import java.util.Arrays;

public class TemplatesTest {
    // Live Templates

    //模版六： prsf:可生成private static final
    private static final Customer cust = new Customer();

    // 变形：psf : public static final
    public static final int NUM1 = 1;

    // 变形：psfi int
    public static final int NUM2 = 2;

    // 变形：psfs string
    public static final String NATION = "China";


    //模版一：psvm
    public static void main(String[] args) {
        // sout
        System.out.println("hello!");
        // 变形: soutp / soutm / soutv / xxx.sout
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("TemplatesTest.main");

        int num1 = 10;
        int num2 = 20;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println(num1);

        // 模版三：fori
        String[] arr = new String[]{"Tom","Jerry","HanMeimei","Lilei"};
        for (int i = 0; i < arr.length; i++) {
            // arr[i].sout
            System.out.println(arr[i]);
        }
        // 变形：iter
        for (String s : arr) {
            System.out.println(s);
        }
        // 变形：itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];

        }
        // 模版四：list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);
        for (Object o : list) {

        }
        // list.fori
        for (int i = 0; i < list.size(); i++) {

        }
        // list.forr 倒序遍历
        for (int i = list.size() - 1; i >= 0; i--) {

        }

    }

    public void method(){
        System.out.println("TemplatesTest.method");

        // 模版五：ifn
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);

        if (list == null) {

        }
        // 变形：inn
        if (list != null) {

        }
        // 变形：xxx.nn / xxx.null
        if (list != null) {

        }
        if (list == null) {

        }

    }
}
