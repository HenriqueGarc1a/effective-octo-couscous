package com.example.bee1168;

import java.util.Scanner;

public class Main {

    /*
    private class Led{

    int[] leds = {6,2,5,5,4,5,6,3,7,6};

    public int countLeds(String s){

        int x = 0;
        
        try {

        for(int i = 0;i<s.length();i++)
            x += leds[s.charAt(i)-48];
            
        } catch (Exception e) {
            return -1;
        }

        return x;

    }

    }

     */
    public static void main(String[] args) {

        Led led = new Led();

        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        String[] inputs = new String[x];

        for(int i = 0;i<x;i++)
            inputs[i] = in.next();

        for(int i = 0;i<x;i++)
            System.out.println(led.countLeds(inputs[i]) + " leds");
        
        in.close();

     
    }
}