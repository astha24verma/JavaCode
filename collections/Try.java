package com.company.collections;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Try {
    public static <Char> void main(String[] args) {
        Stack<Character> s = new Stack<>();
        Stack<String> sbin = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int n;
        char ch;
        n = sc.nextInt();
        while(n > 0) {
            String str = sc.next();
            int count = 0, rcount = 0;
            for (int i = 0; i < str.length(); i++) {
                ch = str.charAt(i);
                if (ch == '('){
                    s.push(ch);
                    count++;
                }
                else if (ch == ')'){
                    if(!(s.empty()) && s.peek() == '('){
                        s.pop();
                    }
                    else{
                        rcount++;
                    }
                }
            }

            if(s.size()==0){
                if(count > 0 && rcount < 1)
                    sbin.push("1");
                else
                    sbin.push("0");
            }
            else{
                sbin.push("0");
            }
            s.clear();
            n--;
        }
        Iterator<String> it = sbin.iterator();
        while(it.hasNext())
            System.out.println(it.next());

    }
}
