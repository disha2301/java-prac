package com.gevernova.annotations.deprecated;

// main class to test the methods
public class Main {
    public static void main(String[] args){
        LegacyAPI api = new LegacyAPI();
        api.oldMethod();  // You'll see a compiler warning here
        api.newMethod();  // Recommended usage
    }
}
