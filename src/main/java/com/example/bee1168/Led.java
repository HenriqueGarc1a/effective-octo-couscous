
package com.example.bee1168;

public class Led{

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