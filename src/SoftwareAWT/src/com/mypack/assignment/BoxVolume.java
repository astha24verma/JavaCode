//21.0:  Write a program using
//        (a) Default Constructor (b)Argument Constructor (c) Copy Constructor
//        To find the volume of a box has its sides w, h, d means width, height and depth. (V=w*h*d)
package com.mypack.assignment;

class CalVolume{
    int w, h, d;
    public CalVolume(){                                            //(a) Default Constructor
        this.w = 1;
        h = 1;
        d = 1;
    }
    public CalVolume(int width, int height, int depth){            //(b)Argument Constructor
        w = width;
        h = height;
        d = depth;
    }
    public CalVolume(CalVolume volume){                              //(c) Copy Constructor
        this.w = volume.w;
        this.h = volume.h;
        this.d = volume.d;
    }
    public int getVolume(){
        return w*h*d;
    }

}

public class BoxVolume {
    public static void main(String[] args) {
        int width, height, depth;
        CalVolume v1 = new CalVolume();
        CalVolume v2 = new CalVolume(4,5,8);
        CalVolume v3 = new CalVolume(v2);
        System.out.println("Volume :"+v1.getVolume() );
        System.out.println("Volume :"+v2.getVolume() );
        System.out.println("Volume :"+v3.getVolume() );
    }

}
