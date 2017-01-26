package com.glivas.passGen;

import java.util.Date;

public class ProgressBar {

    public static void delay(long milliseconds) {
        String bar = "[--------------------]";
        String icon = "%";

        long startTime = new Date().getTime();
        boolean bouncePositive = true;
        int barPosition = 0;

        while((new Date().getTime() - startTime) < milliseconds) {
            if(barPosition < bar.length() && barPosition > 0) {
                String b1 = bar.substring(0, barPosition);
                String b2 = bar.substring(barPosition);
                System.out.print("\r Generating codes: " + b1 + icon + b2);
                if(bouncePositive) barPosition++;
                else barPosition--;
            } if(barPosition == bar.length()) {
                barPosition--;
                bouncePositive = false;
            } if(barPosition == 0) {
                barPosition++;
                bouncePositive = true;
            }

            try { Thread.sleep(100); }
            catch (Exception e) {}
        }
        System.out.print("\n");
    }
}
