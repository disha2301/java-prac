package com.gevernova.datastructure.timecomplexity;
import java.util.*;

public class StringConcatPerformance {
    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 1000000};

        for (int size : sizes) {
            System.out.println("---- Concatenation with " + size + " operations ----");

            // String
            long startString = System.nanoTime();
            String str = "";
            for (int i = 0; i < size; i++) {
                str += "a";
            }
            long endString = System.nanoTime();
            System.out.println("String: " + (endString - startString) / 1_000_000.0 + " ms");

            // StringBuilder
            long startSB = System.nanoTime();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < size; i++) {
                sb.append("a");
            }
            long endSB = System.nanoTime();
            System.out.println("StringBuilder: " + (endSB - startSB) / 1_000_000.0 + " ms");

            // StringBuffer
            long startSBuf = System.nanoTime();
            StringBuffer sBuf = new StringBuffer();
            for (int i = 0; i < size; i++) {
                sBuf.append("a");
            }
            long endSBuf = System.nanoTime();
            System.out.println("StringBuffer: " + (endSBuf - startSBuf) / 1_000_000.0 + " ms");

            System.out.println("-------------------------------------------");
        }
    }
}

