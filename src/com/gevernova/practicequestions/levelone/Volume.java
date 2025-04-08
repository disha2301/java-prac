package com.gevernova.practicequestions.levelone;

import java.io.*;
class Volume {
    public static void main(String[] args) {
        double rad = 6378;
        double kmToM = 0.621371;
        double volK = (4.0 / 3) * Math.PI * Math.pow(rad, 3);
        double volM = volK * Math.pow(kmToM, 3);

        // Display result using a single print statement
        System.out.printf(
            "The volume of Earth in cubic kilometers is %.2f and in cubic miles is %.2f%n",
            volK, volM
        );
    }
}
