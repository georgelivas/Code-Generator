package com.glivas.passGen;


public class PrintLogo {
    public static void codeGen (int times) {
        for (int i = 0; i < times; i++) {
            System.out.println((char) 27 + "[32;m");
            System.out.println(
                    " .d8888b.                888           .d8888b.                    \n" +
                    "d88P  Y88b               888          d88P  Y88b                   \n" +
                    "888    888               888          888    888                   \n" +
                    "888         .d88b.   .d88888  .d88b.  888         .d88b.  88888b.  \n" +
                    "888        d88\"\"88b d88\" 888 d8P  Y8b 888  88888 d8P  Y8b 888 \"88b \n" +
                    "888    888 888  888 888  888 88888888 888    888 88888888 888  888 \n" +
                    "Y88b  d88P Y88..88P Y88b 888 Y8b.     Y88b  d88P Y8b.     888  888 \n" +
                    " \"Y8888P\"   \"Y88P\"   \"Y88888  \"Y8888   \"Y8888P88  \"Y8888  888  888 \n" +
            (char) 27 + "[31;m  Created by George Livas.\n\n"
            );
        }
    }
}
