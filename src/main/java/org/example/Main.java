package org.example;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        System.out.println("---------------------------------------------------- ");
        System.out.println("Barking Dog");

        boolean wake = shouldWakeUp(true, 1);
        System.out.println("Result 1 " + wake);
        boolean wake1 = shouldWakeUp(true, 8);
        System.out.println("Result 2 " + wake1);
        boolean wake2 = shouldWakeUp(false, 2);
        System.out.println("Result 3 " + wake2);
        boolean wake3 = shouldWakeUp(true, -1);
        System.out.println("Result 4 " + wake3);


        System.out.println("---------------------------------------------------- ");
        System.out.println("Teenage");

        boolean teenage = hasTeen(9,19,19);
        System.out.println("Result 1 "+teenage);
        boolean teenage1 = hasTeen(25,15,42);
        System.out.println("Result 2 "+teenage1);
        boolean teenage2 = hasTeen(22,23,34);
        System.out.println("Result 3 "+teenage2);


        System.out.println("---------------------------------------------------- ");
        System.out.println("Cat Playing ");

        boolean catplay = isCatPlaying(true,10);
        System.out.println("Result 1 "+catplay);
        boolean catplay1 = isCatPlaying(false,36);
        System.out.println("Result 2 "+catplay1);
        boolean catplay2 = isCatPlaying(false,35);
        System.out.println("Result 3 "+catplay2);
        System.out.println("---------------------------------------------------- ");
        System.out.println("Area");

        double result=area(5.0,4.0);
        System.out.println("Result 1 = "+result);
        double result1=area(-1.0,4.0);
        System.out.println("Result 2 = "+result1);
        System.out.println("---------------------------------------------------- ");
        System.out.println("Area Cylinder");
        double resultCylinder=area(5.0);
        System.out.println("Result 1 = "+resultCylinder);
        double resultCylinder1=area(-1);
        System.out.println("Result 2 = "+resultCylinder1);


    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {

        if (clock < 0 || clock > 23) {
            return false;
        } else return isBarking && (clock < 8 || clock > 20);
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        if ((firstAge >= 13 && firstAge <= 19) ||
                (secondAge >= 13 && secondAge <= 19) ||
                (thirdAge >= 13 && thirdAge <= 19)) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean isCatPlaying(boolean isSummer, int temp) {
        if((isSummer)&&temp>=35&&temp<=45){
            return true;
        }
        else return temp >= 25 && temp <= 35;

    }


    public static double area(double width, double height) {

        if(width<0||height<0){
            return -1;
        }
        else return  width*height;
    }

    public static double area(double radius) {
        if(radius<0){
            return  -1;
        }
        else return radius*radius*Math.PI;

    }





}

