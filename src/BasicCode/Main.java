package com.company.basicCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class Main{
    public static void main(String[] args) {
        String str1 ="astha";//it is being stored in stack memory
        String str2 = "astha";////it is being stored in stack memory
        String str3 = new String("astha");//it is being stored in heap memory

        System.out.println(str1 == str2);// true
        System.out.println(str2 == str3);// false
        System.out.println(str1 == str3);// false
        System.out.println(str1.equals(str3));// true

        List<Integer> list = new ArrayList<>();
//        list.

//        Map
    }
}


/*
class Test
{
    void show()
    {
        sop("1");
    }
    class xyz extends Test
    {
        void show()
        {
            sop("2");
        }
        class abc extends xyz
        {
            void show()
            {
                super();
                sop("2");
            }
            class Main{
                public static void main(String [] args){
                    Test obj1 = new Test();
                    Test obj2 = new xyz();
                    xyz obj3 = new xyz();
                    xyz obj4 = new abc();
                    abc obj5 = new abc();

                    obj1.show();//op=1
                    obj2.show();//op=1
                    obj3.show();//op=2
                    obj4.show();//op=2
                    obj5.show();//op= 1 2
                }
            }*/
