package com.bridgelabz;

public class LineComparison {

    static void equalsTo(Integer lenght1, Integer lenght2){
        boolean result = lenght1.equals(lenght2);

        if ( result == true )
            System.out.println("Length of lines is Equal");
        else
            System.out.println("Lines are not equals...");
    }
    //Method For Comparing Line
    static void compareTo(Integer length1,Integer length2){
        int result = length1.compareTo(length2);  //comparing two lines with compareTo method
        if(result>0)
            System.out.println("Line 1 is greater... :");
        else if(result<0)
            System.out.println("Line 2 is greater... : ");
        else
            System.out.println("Both lines are Equal...");
    }

    public static void main(String[] args) {

        System.out.println("Welcome to the Line Comparison Problem. ");
        int x1 = 2;
        int y1 = 3;
        int x2 = 6;
        int y2 = 4;
        //calculating length1 of x
        Integer length1 = (int)Math.sqrt((x2-x1)*2 + (y2-y1)*2);
        System.out.println("Length of first line is : " + length1);
        //Initialization of variables
        int c1 = 3;
        int d1 = 4;
        int c2 = 7;
        int d2 = 1;
        //calculating length2 of y
        Integer length2 = (int)Math.sqrt((c2-c1)*2 + (d2-d1)*2);
        System.out.println("Length of second line is : " + length2);
        // calling the equals method by passing 2 objects which we created from a String class
        equalsTo(length1,length2);
        compareTo(length1, length2);
    }
}
