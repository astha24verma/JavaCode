//1.0
package com.mypack.assignment;

public class GradeBook {
    private String courseName;
    private String instructorName;

    public GradeBook( String cname, String iname){
        courseName = cname;
        instructorName = iname;
    }

    public void setCourseName(String name){
        courseName = name;
    }
    public void setInstructorName(String name){
        instructorName = name;
    }
    public String getCourseName(){
        return courseName;
    }
    public String getInstructorName(){
        return instructorName;
    }
    public void displayMessage(){
        System.out.println("Welcome to the grade book for :" + getCourseName());
        System.out.println("This course is presented by : " + getInstructorName());
    }

    public static void main(String[] args) {
        GradeBook b1 = new GradeBook("BagPack","Upadhya");
        //b1.setInstructorName("Gyan Sagar");
        b1.displayMessage();
    }


}
