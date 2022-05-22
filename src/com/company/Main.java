package com.company;

public class Main {

    public static void main(String[] args) {
       double acceleration = -9.81;
       int time = 10;
       double initialVelocity = 0;
       double initialPostion = 0;
       double currentPosition;
       //finding current positon
        currentPosition = 0.5*acceleration*time*time+initialVelocity+initialPostion;
        //outputting current position
        System.out.println(currentPosition);
    }
}
